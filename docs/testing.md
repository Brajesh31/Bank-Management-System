# Testing Plan

## Current status
No automated application test suite or canonical database fixture is checked in. Documentation validation does not test application behavior.

## Safe environment
Use a disposable MySQL database, synthetic names and IDs, and fake card/PIN values. Never use real PAN, Aadhaar, card credentials, or financial data.

## Manual verification matrix

| ID | Scenario | Expected observation |
|---|---|---|
| REG-01 | Complete three registration screens | Expected registration and login rows are created |
| REG-02 | Missing required fields | Submission is blocked where implemented |
| REG-03 | Database insert failure on later page | Failure is visible; partial records are inspected |
| AUTH-01 | Valid synthetic card/PIN | Menu opens |
| AUTH-02 | Invalid card/PIN | Authentication is rejected |
| AUTH-03 | SQL metacharacters in fields | Must not alter query intent; current source is vulnerable |
| DEP-01 | Positive integer deposit | Ledger row is inserted |
| DEP-02 | Empty, zero, negative, decimal, malformed, huge amount | Must be rejected; current validation is incomplete |
| WDR-01 | Withdrawal below balance | Ledger row is inserted |
| WDR-02 | Withdrawal above balance | Insufficient balance appears |
| WDR-03 | Concurrent withdrawals | No overdraft; current design is race-prone |
| CASH-01 | Each fast-cash preset | Correct withdrawal value is recorded |
| BAL-01 | Several deposits and withdrawals | Display matches independent calculation |
| STMT-01 | Multiple ledger rows | Statement shows expected values |
| PIN-01 | Matching new PIN values | Related PIN values update |
| PIN-02 | Mismatched PIN values | Update is blocked |
| DB-01 | MySQL unavailable | Safe actionable error |
| DB-02 | Missing table/column | Failure is surfaced safely |

## Evidence
Record commit SHA, OS, JDK, MySQL version, schema revision, scenario IDs, outcome, and sanitized evidence using [test report template](templates/test-report.md).

## Release acceptance target
A future safe release needs a reproducible clean build, checked-in schema migrations, automated tests, prepared-statement coverage, amount/concurrency tests, secret scanning, and documented manual accessibility review.
