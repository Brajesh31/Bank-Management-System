# Desktop Accessibility Review

## Current observations
Swing windows use absolute positioning patterns. Labels are visible for many controls, but keyboard order, screen reader behavior, scaling, contrast, and focus visibility have not been verified.

## Manual checklist
- [ ] All actions are keyboard reachable.
- [ ] Tab order follows form/task order.
- [ ] Enter/Escape behavior is consistent.
- [ ] Focus indication is visible.
- [ ] Dialogs return focus appropriately.
- [ ] UI remains usable at OS display scaling.
- [ ] Controls and labels are not clipped.
- [ ] Text/background contrast is measured.
- [ ] Color is not the only validation indicator.
- [ ] Required fields and errors are clearly described.
- [ ] PIN fields do not echo secrets.
- [ ] Errors do not expose SQL or stack traces.

Record OS, JDK, scaling, screen reader, steps and findings. This checklist is not a conformance claim.
