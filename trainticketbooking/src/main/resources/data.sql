-- 기차 데이터 삽입
INSERT INTO train (id, train_name) VALUES (1, 'KTX-01');
INSERT INTO train (id, train_name) VALUES (2, 'SRT-01');

-- 좌석 데이터 삽입
INSERT INTO seat (id, seat_number, train_id, is_reserved) VALUES (1, 'A1', 1, false);
INSERT INTO seat (id, seat_number, train_id, is_reserved) VALUES (2, 'A2', 1, false);
INSERT INTO seat (id, seat_number, train_id, is_reserved) VALUES (3, 'B1', 1, false);
INSERT INTO seat (id, seat_number, train_id, is_reserved) VALUES (4, 'B2', 2, false);

-- 역 데이터 삽입
INSERT INTO station (name, location) VALUES ('Seoul Station', 'Seoul');
INSERT INTO station (name, location) VALUES ('Busan Station', 'Busan');
INSERT INTO station (name, location) VALUES ('Daejeon Station', 'Daejeon');
INSERT INTO station (name, location) VALUES ('Daegu Station', 'Daegu');