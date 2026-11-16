# Installation

## Safety
Use a disposable local MySQL database and synthetic data only. The Java source currently hardcodes a database credential. Do not run against real banking or personal data.

## Prerequisites
- JDK 8 or newer.
- MySQL Server.
- Git and a desktop graphical session.
- Bundled MySQL Connector/J 8.0.28 and JCalendar 1.3.3-4 under `lib/`.

## Clone
```bash
git clone https://github.com/Brajesh31/Bank-Management-System.git
cd Bank-Management-System
```

## Database
```sql
CREATE DATABASE bankSystem;
```
The full schema is not checked in. Inspect SQL statements and create a matching schema locally. See [database.md](database.md).

## Credentials
The `.env.example` file is not read by current Java code. Connection details are hardcoded in `conn.java`. Use a dedicated least-privilege local MySQL user and keep any local source adjustment uncommitted. Rotate exposed/reused credentials.

## Compile on Windows PowerShell
```powershell
New-Item -ItemType Directory -Force out
$files = Get-ChildItem -Recurse src -Filter *.java | ForEach-Object { $_.FullName }
javac -cp "lib\mysql-connector-java-8.0.28.jar;lib\jcalendar-tz-1.3.3-4.jar;src" -d out $files
```

## Run on Windows
```powershell
java -cp "out;src;lib\mysql-connector-java-8.0.28.jar;lib\jcalendar-tz-1.3.3-4.jar" bank.management.system.login
```

## Linux/macOS
```bash
mkdir -p out
find src -name '*.java' -print0 | xargs -0 javac -cp "lib/mysql-connector-java-8.0.28.jar:lib/jcalendar-tz-1.3.3-4.jar:src" -d out
java -cp "out:src:lib/mysql-connector-java-8.0.28.jar:lib/jcalendar-tz-1.3.3-4.jar" bank.management.system.login
```
No successful build or runtime is claimed by this documentation change. Verify using your own JDK, MySQL and schema.
