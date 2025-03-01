USE cinema_db;

INSERT INTO movies
(
	director, title, genre, release_year
)
VALUES
	('a','b','c',1999);
    
SELECT * FROM movies;

SELECT id, director, title, genre, release_year
FROM cinema_db.movies;

UPDATE cinema_db.movies
SET director = 'director', title = 'title', genre = 'genre', release_year = 1200
WHERE id = 1;

DELETE
FROM cinema_db.movies
WHERE id = 1;