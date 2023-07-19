# Getting Started

<h2 style="color: #87aade">Database</h2>

### Create database and add user

```sql
create
user crea with password 'crea';
create
database crea;
grant create
on database crea to crea;
alter
user crea with superuser;
\connect
crea;
create schema crea authorization crea;
grant
all
privileges
on
database
crea to crea;
```
