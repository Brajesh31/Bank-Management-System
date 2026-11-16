# Performance Notes

JDBC calls run synchronously in Swing event handlers. Slow queries can block the event-dispatch thread. Transaction screens repeatedly scan ledger rows, and resources are not consistently closed.

## Likely hotspots
- Database connection establishment.
- Full ledger scans by PIN.
- In-memory balance recomputation.
- Mini statement rendering all rows in a JLabel.
- Blocking SQL on the UI thread.
- Unclosed connection/statement/result-set objects.

## Improvement plan
1. Use try-with-resources.
2. Add connection timeouts and controlled lifecycle.
3. Move I/O to SwingWorker or bounded executor.
4. Add indexes after schema/query-plan verification.
5. Paginate statement history.
6. Use typed amounts and dates.
7. Measure before introducing caches.

No benchmark measurements are available.
