# Database

The application connects to MySQL database `bankSystem`. Source code references account, login, and deposit ledger tables. The sign-up classes insert personal and account data; transaction classes query rows by PIN and use `type` and `amount` to calculate balances.

Use a local schema and least-privilege account for development. Add explicit constraints, indexes, foreign keys, numeric amount types, transaction boundaries, migrations, retention, and encrypted backups before production use.

Never store plaintext PINs or real financial data in a development dump.
