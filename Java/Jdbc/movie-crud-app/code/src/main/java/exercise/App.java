package exercise;

import exercise.beans.Movie;
import exercise.dao.MoviesDAO;
import exercise.dao.MoviesDAOImpl;
import exercise.db.DatabaseManager;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class App {

    private static final Scanner scan = new Scanner(System.in);
    private static final MoviesDAO moviesDAO = new MoviesDAOImpl();
    private static int movieCount = 1;

    public static void main(String[] args) throws SQLException {
        printAppTitle();

        DatabaseManager.initializeDatabaseAndTables();
        menu();
        int usersChoice = scan.nextInt();
        while (usersChoice != 5) {
            actOnChoice(usersChoice);
            menu();
            usersChoice = scan.nextInt();
        }
        printAppTitle();
    }

    private static void printAppTitle() {
        System.out.println("\n---------Simple Crud App---------\n");
    }

    private static void menu() {
        System.out.println("Choose an option:");
        System.out.println("1 - Add Movie");
        System.out.println("2 - Delete Movie");
        System.out.println("3 - Update Movie");
        System.out.println("4 - View Movies");
        System.out.println("5 - Exit Program");
    }

    private static void getAndShowMovies() throws SQLException {
        Set<Movie> movies = moviesDAO.getAllMovies();
        showMovies(movies);
    }

    private static void showMovies(Set<Movie> movies) {
        movies.forEach(System.out::println);
    }

    private static void addMovie() throws SQLException {
        Movie movie = new Movie(movieCount, "Title " + movieCount, "Director " + movieCount, "Genre " + movieCount, (int) (Math.random() * 50) + 1976);
        moviesDAO.addMovie(movie);
        movieCount++;
    }

    private static void deleteMovie() throws SQLException {
        getAndShowMovies();
        System.out.println("enter id of one of the above movies in order to delete it");
        int usersChoice = scan.nextInt();
        try {
            moviesDAO.deleteMovie(usersChoice);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static void updateMovie() throws SQLException {
        Set<Movie> movies = moviesDAO.getAllMovies();
        showMovies(movies);
        System.out.println("enter id of one of the above movies in order to update it");
        int usersChoice = scan.nextInt();
        try {
            Movie movie = movies.stream().toList().stream().filter(element -> element.getId() == usersChoice).findFirst().get();
            movie.setGenre(movie.getGenre() + " Changed");
            movie.setTitle(movie.getTitle() + " Changed");
            movie.setDirector(movie.getDirector() + " Changed");
            moviesDAO.updateMovie(usersChoice, movie);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static void actOnChoice(int choice) throws SQLException {
        switch (choice) {
            case 1:
                addMovie();
                break;
            case 2:
                deleteMovie();
                break;
            case 3:
                updateMovie();
                break;
            case 4:
                getAndShowMovies();
                break;
            default:
                System.out.println("Invalid Choice. Choose Again");
                break;
        }
    }
}