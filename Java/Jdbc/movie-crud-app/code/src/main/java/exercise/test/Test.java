package exercise.test;

import exercise.beans.Movie;
import exercise.dao.MoviesDAO;
import exercise.dao.MoviesDAOImpl;
import exercise.db.DatabaseManager;

import java.sql.SQLException;
import java.util.Set;

public class Test {
    public static void test() throws SQLException {
        DatabaseManager.initializeDatabaseAndTables();
        Movie movie1 = new Movie(1, "a", "b", "c", 1990);
        Movie movie2 = new Movie(2, "aa", "bb", "cc", 1990);
        Movie movie3 = new Movie(3, "aaa", "bbb", "ccc", 1990);
        MoviesDAO moviesDAO = new MoviesDAOImpl();
        moviesDAO.addMovie(movie1);
        moviesDAO.addMovie(movie2);
        moviesDAO.addMovie(movie3);
        Set<Movie> movieSet = moviesDAO.getAllMovies();
        movieSet.forEach(System.out::println);
        Movie movie4 = new Movie(4, "ddd", "ddd", "ddd", 1259);
        moviesDAO.updateMovie(2, movie4);
        movieSet = moviesDAO.getAllMovies();
        System.out.println("--------------------");
        movieSet.forEach(System.out::println);
        moviesDAO.deleteMovie(3);
        movieSet = moviesDAO.getAllMovies();
        System.out.println("--------------------");
        movieSet.forEach(System.out::println);
    }
}
