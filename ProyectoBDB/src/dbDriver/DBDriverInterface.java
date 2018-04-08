package dbDriver;

public interface DBDriverInterface {
	Boolean mysqlConnect();
	String executeQuery(String query);
}
