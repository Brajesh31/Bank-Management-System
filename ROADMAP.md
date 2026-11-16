# Roadmap

Proposed work only. Items are not implemented unless verified in source and tests.

## Phase 0: Risk containment
- [ ] Rotate exposed DB credentials and remove them from source/history.
- [ ] Replace SQL concatenation with PreparedStatement.
- [ ] Stop storing PINs in plaintext.
- [ ] Minimize/remove unnecessary identity fields.
- [ ] Use a least-privilege DB account.

## Phase 1: Reproducible engineering
- [ ] Add Maven/Gradle build metadata and supported version matrix.
- [ ] Add SQL migrations and clean database bootstrap.
- [ ] Add unit/integration tests.
- [ ] Add dependency integrity and vulnerability review.
- [ ] Define desktop distribution/artifact policy.

## Phase 2: Transaction correctness
- [ ] Introduce service and repository layers.
- [ ] Use BigDecimal and strict input validation.
- [ ] Use stable account IDs instead of PIN-based ledger linkage.
- [ ] Make balance checks and writes atomic.
- [ ] Add idempotency, rollback and concurrency tests.

## Phase 3: Desktop quality
- [ ] Move database work off Swing event thread.
- [ ] Close resources reliably.
- [ ] Improve safe error handling.
- [ ] Review layout, keyboard access, contrast and screen-reader behavior.

## Phase 4: Operational maturity
- [ ] Document privacy, retention, backup and incident response.
- [ ] Add security checks and release automation.
- [ ] Maintain technical debt register.

**Non-goal:** Do not launch this code as a real banking platform.
