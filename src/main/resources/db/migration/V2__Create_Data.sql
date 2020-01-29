INSERT INTO matrix_types (id, name)
VALUES (1, 'ЮниЛайн'),
       (2, 'ТиАра'),
       (3, 'Кольцо Трикуспидальное'),
       (4, 'Кольцо ЮниЛайн');

INSERT INTO matrices (id, type, size, serial, number)
VALUES (1, 2, 25, '123654978', 1),
       (2, 1, 23, '335664611', 1),
       (3, 1, 23, '546984132', 2);

INSERT INTO baked_frames (timestamp, matrix_id, baking_time_1, baking_time_2, success)
VALUES
(ts '2020-01-24 11:05:47.15', 1, '00:05:35', null, true),
(ts '2020-01-25 13:03:47.15', 2, '00:07:10', null, true),
(ts '2020-01-26 15:01:47.15', 3, '00:08:01', null, true),
(ts '2020-01-26 16:15:47.15', 1, '00:05:55', null, false),
(ts '2020-01-26 17:11:47.15', 3, '00:06:10', null, true),
(ts '2020-01-26 17:23:47.15', 1, '00:03:35', null, true),
(ts '2020-01-26 18:03:47.15', 2, '00:05:03', '00:06:10', true);