CREATE TABLE users(
    user_id SERIAL PRIMARY KEY,
    user_uuid VARCHAR(50),
    name VARCHAR(255),
    email VARCHAR(255)
);