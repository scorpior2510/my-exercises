package exercise.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManager {

    private static final String dropCinemaDB =
            "DROP DATABASE `cinema_db`;";
    private static final String createCinemaDB =
            "CREATE DATABASE `cinema_db`;";
    private static final String createMoviesTable =
            "CREATE TABLE cinema_db.movies\n" +
                    "(\n" +
                    "\tid INT NOT NULL AUTO_INCREMENT,\n" +
                    "    director VARCHAR(50),\n" +
                    "    title VARCHAR(50),\n" +
                    "    genre VARCHAR(50),\n" +
                    "    release_year INT DEFAULT 2024,\n" +
                    "    PRIMARY KEY (id)\n" +
                    ");";

    public static void initializeDatabaseAndTables() throws SQLException {
        Connection con = DatabaseConnection.getConnection();
        Statement stmt = con.createStatement();
//        stmt.executeUpdate(dropCinemaDB);
        stmt.executeUpdate(createCinemaDB);
        stmt.executeUpdate(createMoviesTable);
    }


}
