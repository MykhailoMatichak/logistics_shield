create table if not exists item
(
    id              UUID PRIMARY KEY,
    name            VARCHAR(255) NOT NULL,
    description     TEXT,
    price           NUMERIC(10, 2),
    quantity        INTEGER NOT NULL,
    category        VARCHAR(255),
    serial_number   VARCHAR(255),
    status          VARCHAR(50),
    expiration_date DATE
);