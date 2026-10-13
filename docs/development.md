# Development

Java sources use the `bank.management.system` package and are stored under `src/`. Icons are loaded from `src/icons/` via the classpath.

Build with `javac` and the bundled JARs until a build tool is introduced. Test registration, login, every transaction screen, invalid amounts, insufficient balance, and database outages with disposable records.

Prefer prepared statements, typed numeric parsing, explicit resource closing, and small service classes over adding more SQL directly to Swing event handlers.
