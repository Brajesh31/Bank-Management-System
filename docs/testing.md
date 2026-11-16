# Testing Plan

## Current status
No automated application test suite or canonical database fixture is checked in. Documentation validation does not test Swing workflows or database behavior.

## Safe environment
Use a disposable local MySQL database with synthetic names, IDs, card/PIN values, and transaction amounts. Never use real PAN, Aadhaar, card credentials, or customer data.

## Manual verification matrix

| ID | Scenario | Expected |
|---|---|---|
| REG-01 | Complete registration | Expected registration/login rows created |
| REG-02 | Leave required fields blank | Submission blocked where validation exists |
| REG-03 | Failure during later registration insert | Error visible; partial rows inspected |
| AUTH-01 | Valid synthetic card/PIN | Menu opens |
| AUTH-02 | Invalid card/PIN | Authentication rejected |
| AUTH-03 | SQL metacharacters in input | Must not alter query intent; current source is vulnerable |
| DEP-01 | Positive integer deposit | Deposit row inserted |
| DEP-02 | Empty, zero, negative, decimal, malformed, huge amount | Rejected; current validation is incomplete |
| WDR-01 | Withdrawal below balance | Withdrawal row inserted |
| WDR-02 | Withdrawal above balance | Insufficient balance shown |
| WDR-03 | Concurrent withdrawals | No overdraw; current design is race-prone |
| CASH-01 | Each preset withdrawal | Correct value recorded |
| BAL-01 | Mixed deposits and withdrawals | Total matches independent calculation |
| STMT-01 | Multiple ledger rows | Statement matches expected rows |
| PIN-01 | Matching new PIN entries | Related values updated |
| PIN-02 | Mismatched values | Update blocked |
| DB-01 | MySQL unavailable | Safe actionable error |
| DB-02 | Missing table/column | Operation stops safely |

Record commit SHA, OS, JDK, MySQL version, schema revision, test IDs, and sanitized outcomes using [test report template](templates/test-report.md).

## Future release gate
A safe release needs reproducible builds, schema migrations, automated tests, prepared-statement coverage, money/concurrency tests, secret scanning, and accessibility review.
