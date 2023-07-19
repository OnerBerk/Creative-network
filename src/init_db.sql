create user crea with password 'crea';
create database crea;
grant create on database crea to crea;
alter user crea with superuser;
\connect crea;
create schema crea authorization crea;
grant all privileges on database crea to crea;