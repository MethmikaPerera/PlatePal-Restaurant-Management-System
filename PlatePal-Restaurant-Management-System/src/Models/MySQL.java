package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class MySQL {

    private static Connection connection;

    private static String DBName = "platepal_db";
    private static String User = "root";
    private static String Password = "Password";

    public static void getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + DBName, User, Password);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Database connection closed.");
            } catch (Exception e) {
                System.out.println("Error closing the database connection: " + e.getMessage());
            }
        }
    }

    public static ResultSet executeSearch(String query) throws Exception {
        getConnection();
        return connection.createStatement().executeQuery(query);
    }

    public static Integer executeIUD(String query) throws Exception {
        getConnection();
        return connection.createStatement().executeUpdate(query);
    }

}
