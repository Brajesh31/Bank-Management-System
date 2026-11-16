# Developer Commands

No Maven/Gradle wrapper exists. Run from repository root.

## Check JDK
```bash
java -version
javac -version
```

## Compile on Windows PowerShell
```powershell
New-Item -ItemType Directory -Force out
$files = Get-ChildItem -Recurse src -Filter *.java | ForEach-Object { $_.FullName }
javac -cp "lib\mysql-connector-java-8.0.28.jar;lib\jcalendar-tz-1.3.3-4.jar;src" -d out $files
```

## Compile on Linux/macOS
```bash
mkdir -p out
find src -name '*.java' -print0 | xargs -0 javac -cp "lib/mysql-connector-java-8.0.28.jar:lib/jcalendar-tz-1.3.3-4.jar:src" -d out
```

## Run
```bash
java -cp "out:src:lib/mysql-connector-java-8.0.28.jar:lib/jcalendar-tz-1.3.3-4.jar" bank.management.system.login
```
Use semicolons rather than colons on Windows. MySQL and a compatible schema are required. Build success is not implied by these commands.

## Clean local output
```bash
rm -rf out
```
