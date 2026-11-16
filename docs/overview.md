# Project Overview

## Purpose
Bank Management System is a Java desktop demonstration of an ATM-style workflow. Swing provides the UI, JDBC accesses MySQL, and the database name referenced in source is `bankSystem`.

## Intended audience
- Students learning Java Swing and JDBC.
- Developers studying basic registration and ledger-style CRUD flows.
- Reviewers examining a small desktop codebase.

It is not intended for customers, real financial operations, or a production financial institution.

## In-scope behavior
- Multi-screen account application.
- Card/PIN login query.
- Deposit ledger insert.
- Withdrawal and preset fast-cash flows.
- Balance calculation from ledger records.
- Mini statement screen.
- PIN update across currently referenced tables.

## Explicitly not included
No real money settlement, UPI/NEFT/RTGS/IMPS, KYC verification, internet/mobile banking, ATM hardware interface, fraud monitoring, regulatory compliance, or secure production controls are established by the checked-in code.

## Runtime
The entry point is `bank.management.system.login`. A successful login opens `mainClass`. The menu launches separate JFrame screens. Each screen accesses MySQL directly through the `conn` helper.

## Quality status
There is no Maven/Gradle build manifest, committed SQL migration, automated application test suite, or verified runtime demo. The current database credential and SQL construction are unsafe. See [security review](security-review.md).
