CREATE TABLE IF NOT EXISTS Players(
    id INTEGER AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    team VARCHAR(40),
    position VARCHAR(40),
    ratings INTEGER,
    date_created TIMESTAMP NOT NULL,
    data_updated TIMESTAMP NOT NULL,
    primary key (id)
);