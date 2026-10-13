# Application interfaces

The project has no HTTP API. Its public interfaces are Swing windows and MySQL table operations.

| Class | Responsibility |
| --- | --- |
| `login` | Card/PIN login |
| `signUp`, `signUp2`, `signUp3` | Account registration |
| `mainClass` | Transaction menu |
| `deposit` / `withdraw` / `fastCash` | Ledger transactions |
| `balanceEnquiry` / `mini` | Balance and history |
| `pin` | PIN change |

Database operations are currently performed through the `conn` helper and direct statements. Treat all UI input as untrusted.
