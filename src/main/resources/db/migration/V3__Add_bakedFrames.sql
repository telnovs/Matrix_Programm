create table baked_frames
(
    id int8 identity,
    timestamp timestamp not null,
    matrix_id int8 not null references matrices (id),
    baking_time_1 time not null,
    baking_time_2 time,
    succes boolean not null,
    id_in_1c varchar(15) unique
);

insert into baked_frames (timestamp, matrix_id, baking_time_1, baking_time_2, succes) 
values 
	(ts '2020-01-24 11:05:47.15', 7, '00:05:35', null, true),
	(ts '2020-01-25 13:03:47.15', 3, '00:07:10', null, true),
	(ts '2020-01-26 15:01:47.15', 1, '00:08:01', null, true),
	(ts '2020-01-26 16:15:47.15', 15, '00:05:55', null, false),
	(ts '2020-01-26 17:11:47.15', 15, '00:06:10', null, true),
	(ts '2020-01-26 17:23:47.15', 10, '00:03:35', null, true),
	(ts '2020-01-26 18:03:47.15', 20, '00:05:03', '00:06:10', true);