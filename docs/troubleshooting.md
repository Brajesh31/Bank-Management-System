# Troubleshooting

## JDBC connection fails

Confirm MySQL is running, `bankSystem` exists, the connector JAR is on the classpath, and the configured user has access. Do not publish the exception if it includes connection details.

## Icons are missing

Run with `src` or the compiled resource directory on the classpath so `ClassLoader.getSystemResource("icons/...")` can resolve the images.

## Transactions fail

Check that the expected account and `deposit` tables exist, the PIN matches the logged-in flow, and the amount is a valid non-negative integer. Review the server log privately.

## Build errors

Use a matching JDK and include both JARs from `lib/` in compile and runtime classpaths.
