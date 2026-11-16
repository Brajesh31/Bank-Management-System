# Technical Debt Register

Prioritized issues identified from source. Documentation does not resolve these items.

| ID | Priority | Debt | Recommended action |
|---|---|---|---|
| TD-01 | Critical | Hardcoded MySQL password | Rotate, externalize, remove from history |
| TD-02 | Critical | SQL concatenation | PreparedStatement for all SQL |
| TD-03 | Critical | Plain-text PINs | Reviewed credential hashing/authentication design |
| TD-04 | High | Withdrawal check/write not atomic | Transaction and concurrency control |
| TD-05 | High | No schema migrations | Versioned DDL and bootstrap |
| TD-06 | High | No application tests/build manifest | Reproducible build and tests |
| TD-07 | High | PAN/Aadhaar collection | Data minimization and retention |
| TD-08 | High | JDBC resources not closed | try-with-resources |
| TD-09 | Medium | Integer arithmetic for money | BigDecimal and validation |
| TD-10 | Medium | java.util.Random for IDs | Secure generator and uniqueness |
| TD-11 | Medium | Synchronous JDBC on Swing thread | SwingWorker and timeouts |
| TD-12 | Medium | Stack-trace error handling | Safe errors and sanitized logs |
| TD-13 | Medium | Tracked compiled classes | Reproducible artifact policy |
| TD-14 | Medium | Absolute-position UI | Layout/accessibility review |

## Recommended order
1. Rotate exposed credentials.
2. Remove SQL injection and plaintext PIN handling.
3. Establish schema/migrations.
4. Make ledger operations atomic and monetary arithmetic correct.
5. Add build automation and tests.
6. Improve responsiveness, accessibility, and error handling.
