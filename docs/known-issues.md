# Known Issues

## Build and reproducibility
- No Maven/Gradle build manifest.
- No automated application test suite.
- No canonical database schema or migrations.
- Compiled classes are tracked under `bin/`.
- Bundled dependencies have no automated integrity/vulnerability scan.

## Security and privacy
- DB credentials are hardcoded in `conn.java`.
- `.env.example` is not loaded by the app.
- PINs are stored and queried in plaintext.
- SQL concatenates user-controlled values.
- PAN/Aadhaar fields are collected without minimization/retention design.
- No lockout/rate limiting or production audit mechanism is visible.

## Ledger correctness
- Balance scans rows and parses amounts as `int`.
- Unknown transaction types are subtracted.
- Monetary validation is incomplete.
- Balance check and withdrawal insert are not atomic.
- No idempotency or explicit transaction boundary.
- Ledger lookup uses PIN.

## UI and resources
- JDBC runs synchronously in Swing event handlers.
- JDBC resources are not consistently closed.
- Exceptions frequently print stack traces.
- Absolute layout requires scaling and keyboard-accessibility testing.
- Mini statement has no explicit pagination/sorting contract.

## Evidence gaps
- No verified live demo or runtime screenshots.
- Conceptual ER diagram is not a verified physical schema.
- No automated application test result is claimed.
See [technical debt](../TECHNICAL_DEBT.md).
