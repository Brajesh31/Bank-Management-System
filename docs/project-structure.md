# Project Structure

```text
.
├── .github/                 # Repository workflows and templates
├── .idea/                   # Existing IntelliJ IDEA metadata
├── bin/                     # Existing compiled class files
├── docs/                    # Project, database, QA and security documentation
├── lib/                     # MySQL Connector/J and JCalendar JARs
├── src/
│   ├── bank/management/system/
│   │   └── *.java           # Swing windows and JDBC helper
│   └── icons/               # PNG resources
├── .env.example
├── CHANGELOG.md
├── CONTRIBUTING.md
├── LICENSE
├── README.md
├── ROADMAP.md
├── SECURITY.md
└── SUPPORT.md
```

## Java package
All application Java files use package `bank.management.system`.

| File | Responsibility |
|---|---|
| `login.java` | Entry point and card/PIN login |
| `conn.java` | JDBC connection helper |
| `mainClass.java` | Operation menu |
| `signUp.java`, `signUp2.java`, `signUp3.java` | Three registration screens |
| `deposit.java` | Deposit operation |
| `withdraw.java` | Cash withdrawal |
| `fastCash.java` | Preset withdrawal |
| `balanceEnquiry.java` | Balance calculation |
| `mini.java` | Mini statement |
| `pin.java` | PIN change |

## Dependencies and assets
The `lib/` directory bundles Connector/J and JCalendar. Image assets are in `src/icons/` and are loaded as classpath resources.

## Generated output
The repository already tracks `bin/` class files. The recommended build commands compile into `out/` so new local output does not overwrite tracked files. No Maven/Gradle manifest, test tree, SQL migrations, or configuration loader currently exists.
