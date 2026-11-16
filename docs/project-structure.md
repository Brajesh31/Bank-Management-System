# Project Structure

```text
.
├── .github/                 # Workflows and templates
├── .idea/                   # Existing IntelliJ IDEA metadata
├── bin/                     # Existing compiled classes
├── docs/                    # Engineering and safety documentation
├── lib/                     # JDBC and JCalendar JARs
├── src/
│   ├── bank/management/system/  # Swing screens and JDBC helper
│   └── icons/                   # PNG resources
├── .env.example
├── CHANGELOG.md
├── CONTRIBUTING.md
├── LICENSE
├── README.md
├── ROADMAP.md
├── SECURITY.md
└── SUPPORT.md
```

All Java files use package `bank.management.system`.

| File | Role |
|---|---|
| `login.java` | Entry point and card/PIN login |
| `conn.java` | JDBC connection helper |
| `mainClass.java` | Operation menu |
| `signUp.java`, `signUp2.java`, `signUp3.java` | Registration pages |
| `deposit.java` | Deposit |
| `withdraw.java` | Withdrawal |
| `fastCash.java` | Preset withdrawal |
| `balanceEnquiry.java` | Balance display |
| `mini.java` | Mini statement |
| `pin.java` | PIN change |

Dependencies are bundled under `lib/`; image resources are under `src/icons/`. The tracked `bin/` classes are existing artifacts. Recommended builds use `out/` to avoid overwriting them.

No Maven/Gradle manifest, test source tree, SQL migration directory, or configuration loader is present.
