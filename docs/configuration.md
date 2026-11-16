# Configuration

## Current behavior

| Setting | Existing behavior |
|---|---|
| JDBC URL | Hardcoded in `conn.java` |
| Database username/password | Hardcoded in `conn.java` |
| Database | `bankSystem` |
| Example environment file | `.env.example`, not loaded by Java |
| Driver | MySQL Connector/J 8.0.28 |

Creating a `.env` file does not configure the app today. Java source does not read `DB_URL`, `DB_USER`, or `DB_PASSWORD`.

## Safe local handling
Use a dedicated MySQL user restricted to the disposable database. Do not use root/admin or production credentials. Rotate any exposed credential that remains active.

## Proposed future contract
A refactor could read validated environment variables or JVM properties. The example variable names are `DB_URL`, `DB_USER`, and `DB_PASSWORD`. This is a proposal, not implemented functionality.
