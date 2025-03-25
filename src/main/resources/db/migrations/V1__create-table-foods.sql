CREATE TABLE foods (
                       id SERIAL PRIMARY KEY,
                       title VARCHAR(255) NOT NULL,
                       price BIGINT NOT NULL,
                       image VARCHAR(255)
);