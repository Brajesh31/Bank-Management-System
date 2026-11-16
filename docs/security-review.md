# Security Review

This is a static source review, not a penetration test or certification.

| Priority | Finding | Source evidence | Impact |
|---|---|---|---|
| Critical | Hardcoded MySQL password | `conn.java` | Source readers may obtain a valid database credential |
| Critical | SQL concatenation | Login, signup, transaction, PIN screens | User values can alter SQL statements |
| Critical | Plain-text PIN storage/comparison | Login, signup3, PIN screen | Credential exposure enables impersonation |
| High | PAN/Aadhaar collection without minimization/retention controls | signUp2 | Sensitive identity data exposure |
| High | Non-atomic balance check and ledger insert | withdraw, fastCash | Concurrent operations can violate balance assumptions |
| High | JDBC resources not consistently closed | conn and UI screens | Resource exhaustion |
| High | Weak amount validation and integer arithmetic | Deposit/withdrawal screens | Invalid input, overflow, incorrect totals |
| Medium | Stack traces printed in UI exception paths | Multiple classes | Unsafe diagnostics and poor user feedback |
| Medium | java.util.Random used for identifiers | signup screens | Predictability/collision risk |
| Medium | No lockout/rate limiting visible | login | Credential guessing is not controlled |

## Immediate actions
1. Rotate the embedded credential if it has ever been active outside a disposable environment.
2. Remove the credential from code and coordinate history cleanup separately.
3. Restrict the local database user to the demo schema.
4. Replace SQL concatenation with PreparedStatement.
5. Replace plain-text PIN storage with a reviewed credential design.
6. Stop collecting identifiers unnecessary for the learning objective.

## Remediation sequence
P0: credentials and SQL injection. P1: authentication, ledger integrity and privacy. P2: resource handling, observability, testing and dependency hygiene.

This documentation change does not modify or remediate the Java source.
