create sequence hibernate_sequence start with 1 increment by 1;
create table matrices
(
    id     int8 not null,
    name   varchar(255),
    primary key (id)
);
alter table matrices
    add constraint UK_gj4cco7y40711xp7icvrfqinf unique (name);