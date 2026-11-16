# Installation

## Safety
Use a disposable local MySQL database and synthetic data only. The Java source currently hardcodes a database credential in `conn.java`. Do not run against real banking or personal data.

## Prerequisites
- JDK 8 or newer.
- MySQL Server.
- Git.
- Desktop session capable of opening Swing windows.
- Bundled JARs: MySQL Connector/J 8.0.28 and JCalendar 1.3.3-4.

## Clone
```bash
git clone https://github.com/Brajesh31/Bank-Management-System.git
cd Bank-Management-System
```

## Database
Create a disposable database:
```sql
CREATE DATABASE bankSystem;
```
A full schema is not checked in. Inspect SQL statements and create the expected tables and columns locally. See [database.md](database.md).

## Credentials
The `.env.example` file is not read by current Java code. Connection details are hardcoded in `conn.java`. Use a dedicated least-privilege local MySQL user and keep any local source modification uncommitted. Rotate credentials that have been exposed or reused.

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

## Compile and run on Linux/macOS
```bash
mkdir -p out
find src -name '*.java' -print0 | xargs -0 javac -cp "lib/mysql-connector-java-8.0.28.jar:lib/jcalendar-tz-1.3.3-4.jar:src" -d out
java -cp "out:src:lib/mysql-connector-java-8.0.28.jar:lib/jcalendar-tz-1.3.3-4.jar" bank.management.system.login
```

No clean-build or runtime success is claimed by the documentation update. Validate with your actual database schema and JDK.
