# Deployment Boundaries

The current model is a Java Swing desktop process connecting to MySQL over JDBC. There is no API server, web deployment, container, installer package, or production release workflow.

A local demo may compile the source and include bundled JAR dependencies. Use synthetic data only.

Production blockers include embedded DB credentials, plaintext PIN handling, SQL concatenation, non-atomic ledger operations, sensitive identity capture, no automated app tests, no audit/monitoring, and no recovery plan.

A production financial system requires a separate architecture and security program. Do not deploy this code as a real banking service. No live URL is advertised because this is desktop software and no runtime demo is verified.
