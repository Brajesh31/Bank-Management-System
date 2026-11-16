# Error Handling

Several screens catch broad exceptions and print stack traces. The connection helper also prints connection errors. UI feedback does not consistently distinguish validation, authentication, database and unexpected failures.

| Failure | User-facing target | Diagnostic target |
|---|---|---|
| Invalid amount | Explain accepted format | Do not log sensitive values |
| Invalid credentials | Generic rejection | Audit outcome and rate-limit |
| Database unavailable | State action did not complete | Sanitized exception category |
| Schema mismatch | Stop safely | Record schema version |
| Constraint violation | Explain safe correction | Do not expose SQL |
| Transaction rollback | State no commit occurred | Correlation/operation ID |

Validate before persistence, close resources with try-with-resources, catch expected JDBC failures at the persistence boundary, and never show success unless the write committed.
