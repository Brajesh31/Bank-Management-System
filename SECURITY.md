# Security Policy

## Classification
This is an educational prototype, not production banking software. Never process real customer details, credentials, card data, identity numbers, or financial transactions.

## Known high-risk source conditions
- Hardcoded MySQL connection credential in `src/bank/management/system/conn.java`.
- SQL statements assembled by string concatenation.
- PIN values stored and queried in plain text.
- PAN/Aadhaar fields collected by registration.
- Withdrawal balance check and insert are not atomic.
- No visible production-grade lockout, authorization, audit, or deployment controls.

Assume any committed database credential may be compromised. Rotate it if active outside a disposable local environment. A later commit does not erase secrets from Git history.

## Safe usage
Use synthetic data and a disposable local database only. Never reuse production/admin passwords, publish database dumps, or share logs with identifiers. Do not connect this code to real customer databases.

## Reporting
Do not publish exploitable details in a public issue. Contact the maintainer privately through <https://github.com/brajesh31> with affected path, impact and a sanitized reproduction. Do not attach credentials or personal data.

## Required remediation
Credential rotation/removal, PreparedStatement, secure credential handling, data minimization and atomic ledger operations are mandatory before any security claim.
