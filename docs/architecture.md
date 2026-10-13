# Architecture

Bank Management System is a Java Swing desktop application using JDBC for a MySQL backend.

## Main flow

`login` authenticates a card number and PIN, then creates `mainClass`. The main transaction menu opens dedicated JFrame classes: `deposit`, `withdraw`, `fastCash`, `mini`, `balanceEnquiry`, and `pin`.

The sign-up flow spans `signUp`, `signUp2`, and `signUp3`, collecting personal, account, and card/PIN information before inserting records.

`conn` creates a JDBC connection and shared `Statement`. Screens query the database directly and calculate balances from ledger rows.
