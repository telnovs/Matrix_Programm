create sequence hibernate_sequence start with 1 increment by 1;

create table matrix_types
(
    id   int8 identity,
    name varchar(255) unique,
    primary key (id)
);

create table matrices
(
    id     int8 not null,
    type   int8 references matrix_types(id),
    size   int4,
    serial varchar(255),
    number int4,
    visible boolean default(false),
    primary key (id)
);

create table baked_frames
(
    id int8 identity,
    timestamp timestamp not null,
    matrix_id int8 not null references matrices (id),
    baking_time_1 time not null,
    baking_time_2 time,
    success boolean not null,
    id_in_1c varchar(15) unique
);