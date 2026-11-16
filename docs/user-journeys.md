# User Journeys

These journeys describe current screen flow only. They do not imply identity verification or real banking services.

## New account application
1. Launch `login` and choose Sign Up.
2. Complete `signUp`, which inserts into `signup`.
3. Complete `signUp2`, which inserts into `SignUpTwo`.
4. Complete `signUp3`, which generates card/PIN-like values and inserts `signupthree` and `login` rows.
5. Generated values are displayed and a deposit screen opens.

The sequence is not one database transaction; later failures can leave partial records.

## Existing user login
1. Enter card number and PIN.
2. `login` queries `login`.
3. A match opens `mainClass`; otherwise a rejection appears.

The query uses concatenation and has no visible account lockout.

## Deposit
The user opens Deposit, enters an amount, and the screen inserts a `Deposit` ledger row. Validation checks emptiness but not a complete monetary input contract.

## Withdrawal and fast cash
The app reads ledger rows by PIN, computes a balance, compares the amount, and inserts a `Withdrawl` row when sufficient. Read/check/write is not atomic.

## Balance and mini statement
Balance enquiry computes a ledger total. Mini statement reads card and transaction rows. Ordering and pagination are not guaranteed by observed SQL.

## PIN change
The app checks two new PIN fields and updates `deposit`, `login`, and `signupthree`. The sequence has no explicit transaction boundary.
