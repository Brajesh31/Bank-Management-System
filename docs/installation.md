# Installation

## Requirements

- JDK 8 or newer.
- MySQL Server and the `bankSystem` database.
- MySQL Connector/J 8.0.28 and JCalendar 1.3.3-4, available in `lib/`.

Create the tables expected by the sign-up and transaction classes, then configure the JDBC URL and credentials outside source control. The current source contains a development credential and must be corrected before use.

Build from the repository root using the classpath in [README.md](../README.md). Launch `bank.management.system.login` after compilation.
