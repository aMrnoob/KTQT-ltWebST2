package daoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB_22110311 {
	
	private static final String URL = "jdbc:sqlserver://DESKTOP-0Q6FFSV:1433;databaseName=BookStore;encrypt=false;trustServerCertificate=true;";
    
    public static Connection getConnection() throws SQLException {
    	try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(URL, "bookStore", "123456789");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new SQLException("SQL Server Driver not found");
        } catch (SQLException e) {
            System.out.println("Connection failed to database: " + URL);
            System.out.println("Error message: " + e.getMessage());
            e.printStackTrace();
            throw e;
        }
    }
}
