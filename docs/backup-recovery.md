# Backup and Recovery

This guide is for synthetic local development data only, not production financial data.

Example export:
```bash
mysqldump --databases bankSystem --single-transaction > bankSystem-dev.sql
```

Example restore into a disposable local instance:
```bash
mysql < bankSystem-dev.sql
```

Inspect dumps before sharing. They may contain credentials and personal values. Keep them outside the repository with restricted permissions.

A financial service needs encrypted backups, controlled access, point-in-time recovery, integrity checks, retention, separate copies, immutable audit evidence, and tested recovery objectives. None are implemented here.
