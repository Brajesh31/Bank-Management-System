# Deployment

This desktop application should be distributed only to trusted operators and connected to a private database service. Do not expose MySQL to the public internet.

Before deployment:

- remove credentials from `conn.java`;
- create a least-privilege database user;
- use TLS for JDBC connections;
- replace direct PIN storage and SQL concatenation;
- enable audit logging and backups;
- validate all transaction amounts and use database transactions;
- package dependencies reproducibly and verify JAR provenance.

There is no CI or deployment automation in this repository.
