# User Journeys

These journeys reflect the current screen flow and do not imply identity verification or real financial services.

## New account application
1. Launch `login`.
2. Select Sign Up.
3. Complete `signUp` personal details, which inserts into `signup`.
4. Complete `signUp2` additional details, which inserts into `SignUpTwo`.
5. Complete `signUp3` account/service choices.
6. The app generates card/PIN-like values and inserts `signupthree` and `login` rows.
7. The generated values are displayed and a deposit screen opens.

The three steps are not one database transaction. Later failures can leave partial records.

## Existing user login
1. Enter card number and PIN.
2. `login` queries the `login` table.
3. A matching row opens `mainClass`.
4. An unmatched row produces an incorrect-credentials message.

The current query uses SQL concatenation and has no visible account lockout.

## Deposit
1. Open Deposit from the menu.
2. Enter an amount.
3. The app inserts a `Deposit` ledger row.
4. It reports success and returns to the menu.

## Withdrawal and fast cash
1. Select an amount or preset.
2. The app reads all ledger rows for the PIN and calculates a balance.
3. If balance is sufficient, it inserts a `Withdrawl` row.
4. Otherwise, it displays insufficient balance.

The read/check/insert sequence is not atomic.

## Balance and mini statement
Balance enquiry computes the sum from ledger rows. Mini statement reads card data and transaction rows, masks part of the card number, and displays the calculated total. Ordering/pagination are not established.

## PIN change
The user enters and confirms a new PIN. The current code updates `deposit`, `login`, and `signupthree`. The update sequence is not protected by an explicit transaction.
