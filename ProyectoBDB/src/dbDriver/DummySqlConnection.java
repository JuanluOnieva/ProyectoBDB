package dbDriver;

public class DummySqlConnection implements DBDriverInterface {

	public DummySqlConnection(String url, String user, String password) {
		mysqlConnect();
	}
	
	public Boolean mysqlConnect() {
		return true;
	}

	public String executeQuery(String query) {
		return "Test result";
	}

}