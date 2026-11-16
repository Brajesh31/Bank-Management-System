# Privacy and Data Handling

## Registration fields observed
The UI collects name, father's name, DOB, gender, email, marital status, address, city, postal code, religion, category, income range, education, occupation, PAN, Aadhaar, account type, card/PIN-like values, and service preferences.

This is a broad set of information for a learning prototype.

## Safe development
- Use synthetic values only.
- Never enter real PAN/Aadhaar, card numbers, PINs, or customer records.
- Do not attach unredacted logs or database dumps to issues.
- Restrict local DB access and delete test records when no longer needed.
- Keep identifiers out of screenshots and commits.

## Data minimization
Remove fields not needed for the programming demonstration. For retained fields document purpose, access, retention, and deletion. Current code does not implement consent, retention, export, or deletion lifecycle.

This is not legal advice or a privacy compliance assessment.
