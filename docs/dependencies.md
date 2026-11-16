# Dependency Register

| Dependency | Bundled file | Purpose observed |
|---|---|---|
| MySQL Connector/J | `lib/mysql-connector-java-8.0.28.jar` | JDBC driver |
| JCalendar | `lib/jcalendar-tz-1.3.3-4.jar` | Registration date chooser |

## Platform needs
JDK, MySQL Server, and desktop graphical environment.

## Current gaps
No Maven/Gradle manifest, dependency lock, automated vulnerability scan, checksum register, or upgrade cadence is present.

## Upgrade procedure
1. Identify official artifact/version.
2. Review JDK and MySQL compatibility.
3. Verify trusted checksums/signatures.
4. Update dependency and this register.
5. Compile from clean checkout.
6. Exercise JDBC and date selection.
7. Record the change in CHANGELOG.

Avoid binaries from unknown sources.
