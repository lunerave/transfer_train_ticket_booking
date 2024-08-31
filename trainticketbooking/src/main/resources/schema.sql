CREATE TABLE train (
                       id BIGINT AUTO_INCREMENT PRIMARY KEY,
                       train_name VARCHAR(255) NOT NULL
);

CREATE TABLE seat (
                      id BIGINT AUTO_INCREMENT PRIMARY KEY,
                      seat_number VARCHAR(10) NOT NULL,
                      train_id BIGINT NOT NULL,
                      is_reserved BOOLEAN NOT NULL,
                      CONSTRAINT fk_train FOREIGN KEY (train_id) REFERENCES train(id)
);

CREATE TABLE station
(
    id       BIGINT AUTO_INCREMENT PRIMARY KEY,
    name     VARCHAR(255) NOT NULL,
    location VARCHAR(255) NOT NULL
);

CREATE TABLE reservation
(
    id               BIGINT AUTO_INCREMENT PRIMARY KEY,
    userid           VARCHAR(255) NOT NULL ,
    train_id         BIGINT,
    seat_id          BIGINT,
    start_station_id BIGINT, -- 출발역
    end_station_id   BIGINT, -- 도착역
    reservation_time TIMESTAMP,
    FOREIGN KEY (train_id) REFERENCES train (id),
    FOREIGN KEY (seat_id) REFERENCES seat (id),
    FOREIGN KEY (start_station_id) REFERENCES station (id),
    FOREIGN KEY (end_station_id) REFERENCES station (id)
);

