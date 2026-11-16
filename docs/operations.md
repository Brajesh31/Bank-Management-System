# Local Operations

The app runs as a desktop process against a developer-managed MySQL database. There is no web service, health endpoint, monitoring agent, production supervisor, or support rotation.

## Startup checklist
- JDK and MySQL installed.
- Disposable schema prepared.
- Local connection setting safe and uncommitted.
- Both bundled JARs on classpath.
- Compile into ignored `out/`.
- Launch `bank.management.system.login`.

## Maintenance
Rotate local credentials, review dependency versions/provenance, use synthetic data, remove generated output/test records, sanitize logs, and update docs when SQL or screen behavior changes.

## Not implemented
No metrics, alerting, centralized logs, health checks, automatic backups, release deployment, or operational SLOs.
