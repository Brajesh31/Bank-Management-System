# Requirements and Scope

## Educational purpose
Demonstrate desktop UI navigation and JDBC persistence using Java Swing and MySQL.

## Functional behavior evidenced in source
- FR-01 Launch a login window.
- FR-02 Accept card number and PIN and query the login table.
- FR-03 Provide a three-page account application.
- FR-04 Collect personal and additional registration fields.
- FR-05 Select an account type and service preferences.
- FR-06 Generate card/PIN-like values for a demo account.
- FR-07 Provide a menu for transaction screens.
- FR-08 Insert a deposit row.
- FR-09 Check a computed balance before withdrawal.
- FR-10 Offer preset fast-cash values.
- FR-11 Display a computed balance.
- FR-12 Display a mini statement.
- FR-13 Update PIN-related values in referenced tables.

## Target quality requirements
- NFR-01: Reproducible build for a documented JDK.
- NFR-02: Local secrets never committed.
- NFR-03: Synthetic test data only.
- NFR-04: Documentation distinguishes implemented behavior and proposed work.
- NFR-05: JDBC resources reliably closed.
- NFR-06: UI remains responsive during database operations.
- NFR-07: Inputs are safely validated and SQL is parameterized.

NFR-02 through NFR-07 are target requirements; the current implementation does not satisfy all of them.

## Non-goals
No real banking service, payment rails, KYC verification, production ATM integration, internet banking, mobile app, or regulatory compliance.
