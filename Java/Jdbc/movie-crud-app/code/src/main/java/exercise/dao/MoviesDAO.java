package exercise.dao;

import exercise.beans.Movie;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;

public interface MoviesDAO {
    void addMovie(Movie movie) throws SQLException;
    Set<Movie> getAllMovies() throws SQLException;
    void updateMovie(int id, Movie movie) throws SQLException;
    void deleteMovie(int id) throws SQLException;

}
