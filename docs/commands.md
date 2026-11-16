# Developer Commands

Run commands from the project root. There is no Maven/Gradle wrapper today.

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
Use semicolons instead of colons in Windows classpaths. MySQL must be running, a matching schema must exist, and local connection settings must be safe.

## Clean generated output
```bash
rm -rf out
```
PowerShell: `Remove-Item -Recurse -Force out`.

Build/test success is not implied by the existence of these commands.
