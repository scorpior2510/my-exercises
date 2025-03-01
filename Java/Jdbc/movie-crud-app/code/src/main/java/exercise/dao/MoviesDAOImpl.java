package exercise.dao;

import exercise.beans.Movie;
import exercise.db.DatabaseConnection;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class MoviesDAOImpl implements MoviesDAO {
    @Override
    public void addMovie(Movie movie) throws SQLException {
        Connection con = DatabaseConnection.getConnection();
        String sql = "" +
                "INSERT INTO cinema_db.movies\n" +
                "(\n" +
                "\tdirector, title, genre, release_year\n" +
                ")\n" +
                "VALUES\n" +
                "\t (?, ?, ?, ?);";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, movie.getDirector());
        stmt.setString(2, movie.getTitle());
        stmt.setString(3, movie.getGenre());
        stmt.setInt(4, movie.getReleaseYear());
        stmt.executeUpdate();
    }

    @Override
    public Set<Movie> getAllMovies() throws SQLException {
        Connection con = DatabaseConnection.getConnection();
        Statement stmt = con.createStatement();
        String query = "" +
                "SELECT id, director, title, genre, release_year\n" +
                "FROM cinema_db.movies";
        ResultSet rs = stmt.executeQuery(query);
        Set<Movie> movies = new HashSet<>();
        while (rs.next()) {
            int id = rs.getInt(1);
            String director = rs.getString(2);
            String title = rs.getString(3);
            String genre = rs.getString(4);
            int releaseYear = rs.getInt(5);
            Movie movie = new Movie(id, title, director, genre, releaseYear);
            movies.add(movie);
        }
        return movies;
    }

    @Override
    public void updateMovie(int id, Movie movie) throws SQLException {
        Connection con = DatabaseConnection.getConnection();
        String query = "" +
                "UPDATE cinema_db.movies\n" +
                "SET director = ?, title = ?, genre = ?, release_year = ?\n" +
                "WHERE id = ?;";
        PreparedStatement stmt = con.prepareStatement(query);
        stmt.setString(1, movie.getDirector());
        stmt.setString(2, movie.getTitle());
        stmt.setString(3, movie.getGenre());
        stmt.setInt(4, movie.getReleaseYear());
        stmt.setInt(5, id);
        stmt.executeUpdate();
    }

    @Override
    public void deleteMovie(int id) throws SQLException {
        Connection con = DatabaseConnection.getConnection();
        String sql = "DELETE\n" +
                "FROM cinema_db.movies\n" +
                "WHERE id = ?;";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.executeUpdate();
    }
}
