# Architecture

## System shape
The program is a single-process Java desktop application. Swing screens handle presentation and events. Screen classes execute JDBC calls directly through `conn`. MySQL persists records.

```mermaid
flowchart TB
 U([Desktop user]) --> UI[Java Swing windows]
 UI --> E[ActionListener handlers]
 E --> S[Registration and transaction screens]
 S --> C[conn.java]
 C --> D[MySQL Connector/J]
 D --> DB[(MySQL bankSystem)]
 J[JCalendar library] -. date chooser .-> R[signUp]
```

## Main classes

| Class | Observed responsibility |
|---|---|
| `login` | Entry/login query and sign-up navigation |
| `mainClass` | Main operation menu |
| `conn` | Creates JDBC connection and Statement |
| `signUp` | Personal registration insert |
| `signUp2` | Additional profile insert |
| `signUp3` | Account/service selection and credential inserts |
| `deposit` | Deposit ledger insert |
| `withdraw` | Computes balance and inserts withdrawal |
| `fastCash` | Preset withdrawal and balance check |
| `balanceEnquiry` | Computes and displays balance |
| `mini` | Displays card suffix and ledger rows |
| `pin` | Updates PIN in three referenced tables |

## Navigation
1. `login.main` constructs the entry frame.
2. Sign-up opens the three registration windows in sequence.
3. Login queries `login` by card number and PIN.
4. A matching row opens `mainClass`.
5. The menu opens one operation window.
6. Back actions construct a new menu frame; exit terminates the process.

## Registration
Each signup page inserts its own records. The flow is not visibly wrapped in a single database transaction. A later failure can leave earlier records persisted. Generated identifiers use `java.util.Random`, not a cryptographically secure generator.

## Persistence and threading
The helper targets `jdbc:mysql://localhost:3306/bankSystem` and creates a plain `Statement`. SQL lives in UI event handlers, with no separate service/repository layer. JDBC calls run synchronously and can block the Swing event-dispatch thread. JDBC resources are not consistently closed.

See [technical debt](../TECHNICAL_DEBT.md).
