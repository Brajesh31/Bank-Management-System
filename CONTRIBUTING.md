# Contributing

This is an educational Java Swing/MySQL prototype. Contributions should improve learning value, reproducibility, maintainability and safety. Do not present it as production banking software.

## Before contributing
1. Read README, SECURITY and relevant docs.
2. Check existing issues.
3. Use a disposable local database.
4. Use synthetic names, IDs, card/PIN values and amounts only.
5. Never commit credentials, database dumps or personal financial information.

## Workflow
1. Create a focused branch.
2. Preserve existing source/assets unless explicitly required.
3. Keep local credentials untracked.
4. Compile using docs/commands.md.
5. Manually verify affected screens and database paths.
6. Add automated tests where test infrastructure exists.
7. Update schema, architecture, security and user docs when behavior changes.
8. Submit a PR with scope, checks and security implications.

## Code expectations
- Use PreparedStatement.
- Validate inputs and monetary values.
- Use BigDecimal for money.
- Close JDBC resources with try-with-resources.
- Keep business rules out of UI handlers.
- Use SwingWorker for blocking database work.
- Never log secrets or personal data.
- Document new dependencies and verify provenance.

## PR checklist
- [ ] Clear scope and rationale.
- [ ] Existing files/assets preserved.
- [ ] No credentials or personal data added.
- [ ] SQL/schema effects documented.
- [ ] Tests/manual checks described honestly.
- [ ] Security, privacy and accessibility considered.

Report vulnerabilities privately using SECURITY.md.
