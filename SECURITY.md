# Security Policy

## Prototype limitations

The application currently includes a hardcoded MySQL connection password in `conn.java`, stores and queries PIN values directly, constructs SQL statements through string concatenation in transaction screens, and has no production-grade authorization, auditing, encryption, or transaction isolation. Do not connect it to real accounts or financial data.

Before deployment, externalize secrets, hash or tokenize credentials appropriately, use prepared statements, validate numeric amounts, enforce database transactions and authorization, encrypt transport/storage, add audit logs, and protect card/PIN workflows against brute force.

## Reporting

Do not publish credentials, SQL injection details, or financial data in an issue. Contact Brajesh Kumar privately through <https://github.com/brajesh31> with sanitized reproduction steps, impact, and affected class.
