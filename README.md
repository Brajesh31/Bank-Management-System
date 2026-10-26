# Bank Management System

Bank Management System is a Java Swing desktop ATM demonstration backed by MySQL. It includes a multi-step account application form, card/PIN login, and transaction screens for deposits, withdrawals, fast cash, balance enquiries, mini statements, and PIN changes.

> **Educational prototype:** This code is not suitable for real banking or financial data. The current implementation contains a hardcoded MySQL password and builds SQL statements by concatenating user input. Review [SECURITY.md](SECURITY.md) before running it with anything other than a disposable local database.

## Features

- Swing login and registration UI.
- Multi-page personal, account, and card/PIN sign-up flow.
- Deposit and withdrawal ledger.
- Fast cash, mini statement, balance enquiry, and PIN change screens.
- MySQL JDBC persistence.
- JCalendar date chooser and bundled image assets.

## Requirements

- JDK 8 or newer.
- MySQL Server with a database named `bankSystem`.
- MySQL Connector/J and JCalendar JARs (bundled under `lib/`).

## Build and run

Create the database and tables expected by the source, then update `src/bank/management/system/conn.java` with local, untracked credentials. A basic Windows build from the repository root is:

```powershell
New-Item -ItemType Directory -Force out
javac -cp "lib\mysql-connector-java-8.0.28.jar;lib\jcalendar-tz-1.3.3-4.jar;src" -d out (Get-ChildItem -Recurse src\*.java)
java -cp "out;src;lib\mysql-connector-java-8.0.28.jar;lib\jcalendar-tz-1.3.3-4.jar" bank.management.system.login
```

On POSIX systems, replace `;` with `:` in the classpath. The IDE metadata under `.idea/` is optional.

## Application flow

`login` authenticates `card_no` and `pin`, then opens `mainClass`. Transaction screens use the PIN to query the `deposit` table and calculate the balance from deposit and withdrawal rows. `signUp`, `signUp2`, and `signUp3` collect account data and insert records into the MySQL schema.

## Development

Keep database credentials outside source control. Test with disposable accounts and verify registration, login failure, deposits, withdrawals, insufficient balance, statements, PIN changes, and database failure paths. There is no automated test suite or build manifest.

See [docs/architecture.md](docs/architecture.md), [docs/database.md](docs/database.md), and [docs/troubleshooting.md](docs/troubleshooting.md).

## License

Released under the MIT License. See [LICENSE](LICENSE).

Last updated: 2026-10-26 00:02 UTC
