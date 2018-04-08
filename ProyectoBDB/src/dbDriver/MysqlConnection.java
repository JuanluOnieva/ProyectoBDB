package dbDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnection implements DBDriverInterface{
	String connectionString;
	Connection conn = null;
	
	public MysqlConnection(String url, String user, String password) {
		connectionString="jdbc:" + url +"?" + "user=" + user + "&password=" + password;
		mysqlConnect();
	}
	
	public Boolean mysqlConnect() {
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

	@Override
	public String executeQuery(String query) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
