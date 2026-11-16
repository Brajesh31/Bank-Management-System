# FAQ

**Is this production banking software?** No. It is a Java Swing/MySQL learning prototype.

**Is there a live demo?** No verified public demo. It requires a local JDK and MySQL database.

**Which database is used?** MySQL database `bankSystem`.

**Does the app read .env?** No. The example is not loaded; connection settings are hardcoded in `conn.java`.

**Is a SQL schema included?** No complete schema or migration is checked in.

**Does it use Maven or Gradle?** No build manifest is present.

**Are automated tests included?** No application test suite is checked in.

**Can I use real identity/card/PIN data?** No. Use synthetic values only.

**Why missing table/column errors?** Local schema must match SQL statements in source. Review [database.md](database.md).

**Why can it not connect?** Check MySQL, host/port, database, local credential and Connector/J classpath. Never post passwords publicly.
