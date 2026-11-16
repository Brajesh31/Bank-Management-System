# Security Review

This is a static source review, not a penetration test or security certification.

| Priority | Finding | Evidence | Impact |
|---|---|---|---|
| Critical | Hardcoded MySQL password | `conn.java` | Repository readers may obtain a live DB credential |
| Critical | SQL string concatenation | Login, signup, transaction and PIN screens | User values can change SQL meaning |
| Critical | Plain-text PIN storage/comparison | Login, signup3 and PIN screen | Credential disclosure enables impersonation |
| High | PAN/Aadhaar collection without privacy/retention design | signUp2 | Sensitive identity exposure |
| High | Non-atomic balance check and withdrawal insert | withdraw, fastCash | Concurrent updates invalidate checks |
| High | JDBC resources not consistently closed | conn and screen classes | Resource exhaustion |
| High | Weak amount validation/integer arithmetic | Transaction screens | Invalid input and overflow |
| Medium | Broad exception printing | Multiple classes | Unsafe diagnostics and poor feedback |
| Medium | java.util.Random for generated values | Signup screens | Predictability/collision risk |
| Medium | No visible lockout/rate limit | login | Credential guessing is not controlled |

## Immediate actions
1. Rotate embedded credential if active beyond disposable local use.
2. Remove it from source and coordinate history cleanup separately.
3. Use a least-privilege database account.
4. Replace SQL concatenation with PreparedStatement.
5. Replace plain-text PIN handling with a reviewed credential design.
6. Minimize sensitive identity data.

## Remediation order
P0: secrets and SQL injection. P1: authentication, ledger integrity and privacy. P2: resource lifecycle, error handling, testing and dependency hygiene.

This documentation change does not remediate the Java source.
