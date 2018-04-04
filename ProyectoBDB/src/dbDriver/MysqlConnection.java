package dbDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnection {
	String connectionString;
	Connection conn = null;
	
	public MysqlConnection(String url, String user, String password) {
		connectionString="jdbc:" + url +"?" + "user=" + user + "&password=" + password;
		mysqlConnect();
	}
	
	Boolean mysqlConnect() {
		try {
			conn = DriverManager.getConnection(connectionString);
		} catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		    return false;
		}
		return true;
	}
	

}
