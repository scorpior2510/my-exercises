package exercise.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static Connection getConnection() {
        String dbUrl = "jdbc:mysql://localhost:3306?createDbIfNotExists=true";
        Connection con = null;
        try {
            con = DriverManager.getConnection(dbUrl, "root", "1234");
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
        return con;
    }
}
