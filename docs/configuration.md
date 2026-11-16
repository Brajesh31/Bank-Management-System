# Configuration

## Existing behavior

| Setting | Current behavior |
|---|---|
| JDBC URL | Hardcoded in `conn.java` |
| DB username/password | Hardcoded in `conn.java` |
| Database name | `bankSystem` |
| Example environment file | `.env.example`, not consumed by Java |
| Driver | MySQL Connector/J 8.0.28 |

Creating a `.env` file does not configure the application today. The source does not read `DB_URL`, `DB_USER`, or `DB_PASSWORD`.

## Safe local handling
Use a dedicated MySQL user with privileges limited to the disposable local database. Do not use a root/admin credential, production account, or real data. Rotate any committed credential that remains active.

## Future configuration contract
A refactor could read validated environment variables or JVM properties. The example variable names are `DB_URL`, `DB_USER`, and `DB_PASSWORD`. Treat this as a proposed interface only, not an implemented feature. Secrets must never be committed.
