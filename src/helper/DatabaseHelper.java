package helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseHelper {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/db_absensi";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "";
    
    private Connection connection; // membuat koneksi
    
    // membuat method untuk memasukkan koneksi database ke program
    public DatabaseHelper(){
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (SQLException e){
            System.err.println("Failed to connect to database: " + e.getMessage());
        }
    }
    
    // method untuk menyeleksi data
    public ResultSet executeQuery(String query){
        ResultSet resultSet = null;
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            resultSet = statement.executeQuery();   
        } catch (SQLException e){
            System.err.println("Failed to execute to query: " + e.getMessage());
        }
        return resultSet;
    }
    // method untuk memanipulasi data 
    public int executeUpdate(String query){
        int rowsAffected = 0;
        try{
            PreparedStatement statement = connection.prepareStatement(query);
            rowsAffected = statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Failed to execute update: " + e.getMessage());
        }
        return rowsAffected;
    }
    
    // Menutup koneksi ke database
    public void close() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            System.err.println("Failed to close database connection: " + e.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }
}