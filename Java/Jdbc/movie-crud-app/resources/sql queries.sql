
CREATE DATABASE cinema_db;

CREATE TABLE cinema_db.movies
(
	id INT NOT NULL AUTO_INCREMENT,
    director VARCHAR(50),
    title VARCHAR(50),
    genre VARCHAR(50),
    release_year INT DEFAULT 2024,
    PRIMARY KEY (id)
);
		