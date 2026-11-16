# Requirements and Scope

## Purpose
Demonstrate desktop UI navigation and JDBC persistence using Java Swing and MySQL.

## Functional behavior evidenced in source
- FR-01 Launch a login window.
- FR-02 Accept card/PIN and query the login table.
- FR-03 Provide a three-page account application.
- FR-04 Collect personal and additional registration fields.
- FR-05 Select account type and service preferences.
- FR-06 Generate card/PIN-like values for a demo.
- FR-07 Provide a transaction menu.
- FR-08 Insert a deposit ledger row.
- FR-09 Check computed balance before withdrawal.
- FR-10 Offer preset fast-cash values.
- FR-11 Display computed balance.
- FR-12 Display transaction rows.
- FR-13 Update PIN-related values in referenced tables.

## Target quality requirements
- NFR-01 Reproducible build for documented JDK.
- NFR-02 Secrets never committed.
- NFR-03 Synthetic data only.
- NFR-04 Docs distinguish implementation from proposals.
- NFR-05 JDBC resources closed reliably.
- NFR-06 UI responsive during database operations.
- NFR-07 Inputs validated and SQL parameterized.

NFR-02 through NFR-07 are target requirements; current code does not satisfy them all.

## Non-goals
No real banking service, payment rails, KYC, production ATM integration, internet banking, mobile app, or regulatory compliance.
