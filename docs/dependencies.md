# Dependency Register

| Dependency | File | Observed purpose |
|---|---|---|
| MySQL Connector/J | `lib/mysql-connector-java-8.0.28.jar` | JDBC driver |
| JCalendar | `lib/jcalendar-tz-1.3.3-4.jar` | Registration date chooser |

## Platform requirements
- JDK with compiler/runtime.
- MySQL Server.
- Desktop graphical environment.

## Current gaps
No Maven/Gradle manifest, dependency lock, automated vulnerability scan, checksum register, or documented upgrade cadence is present.

## Upgrade procedure
1. Identify the official artifact and version.
2. Review compatibility with the supported JDK and MySQL version.
3. Verify artifact integrity using trusted upstream checksums/signatures where available.
4. Update dependency files and this register together.
5. Compile from a clean checkout.
6. Exercise database connectivity and date selection.
7. Record the change in CHANGELOG.

Do not add binaries from unknown sources.
