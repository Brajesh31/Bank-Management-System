# Project Overview

## Purpose
A Java desktop demonstration of an ATM-style workflow. Swing provides the user interface, JDBC accesses MySQL, and the database name referenced in source is `bankSystem`.

## Intended audience
Students learning Java Swing/JDBC and developers studying a small desktop CRUD and ledger-style flow. It is not intended for customers or real financial operations.

## Behavior represented
- Multi-screen account application.
- Card/PIN login query.
- Deposit ledger insert.
- Withdrawal and preset fast-cash flows.
- Balance calculation from ledger records.
- Mini statement screen.
- PIN update across currently referenced tables.

## Not included
No real money settlement, payment rails, KYC verification, internet/mobile banking, ATM hardware interface, fraud monitoring, regulatory compliance, or secure production controls are established by the code.

## Runtime
Entry point: `bank.management.system.login`. Successful login opens `mainClass`. Menu selections construct separate operation windows. Screens use the `conn` helper for MySQL access.

## Quality status
No Maven/Gradle build manifest, committed SQL migration, automated application test suite, or verified live demo is present. The database credential and SQL construction require urgent remediation.
