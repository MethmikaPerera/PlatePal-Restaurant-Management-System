package Models;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
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



//Edit
//import java.io.FileInputStream;
//import java.io.ObjectInputStream;
//import java.io.Serializable;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//
//public class MySQL2 implements Serializable{
//    public String ip;
//    public String port;
//    public String pw;
//    public String un;
//    public String dbname;
//    
//    public String dump;
//    public String path;
//    
//    private static Connection connection;
//    
//    public static void createConnection() throws Exception {
//        if (connection == null) {
//            FileInputStream inputStream = new FileInputStream("dbinfo.ser"); //Make this type File
//            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream); //
//            MySQL2 db = (MySQL2) objectInputStream.readObject(); //Read file
//            objectInputStream.close();
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            connection = DriverManager.getConnection("jdbc:mysql://"+db.ip+":"+db.port+"/"+db.dbname, db.un, db.pw);
//        }
//    }
//
//    public static ResultSet executeSearch(String query) throws Exception {
//        createConnection();
//        return connection.createStatement().executeQuery(query);
//    }
//
//    public static Integer executeIUD(String query) throws Exception {
//        createConnection();
//        return connection.createStatement().executeUpdate(query);
//    }
//}
