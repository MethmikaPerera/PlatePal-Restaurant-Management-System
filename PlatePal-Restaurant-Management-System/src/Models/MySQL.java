package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class MySQL {

    private static Connection connection;

    private static String DBURL = "jdbc:mysql://localhost:3306/platepal_db";
    private static String User = "root";
    private static String Password = "Password";

    public static void getConnection() throws Exception {
        if (connection == null) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(DBURL, User, Password);
        }
    }

    public static void closeConnection() throws Exception {
        if (connection != null) {
                connection.close();
                System.out.println("Database connection closed.");
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
