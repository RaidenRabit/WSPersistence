package DbLayer;
import java.sql.*;
import java.util.Properties;

public class DbConnection {
	
	private static DbConnection connect;
	private Connection conection;
	
	private static final String dbName= "dmaj0916_197319";
	private static final String serverAddress= "kraka.ucn.dk";
	private static final int serverPort= 1433;
	
	private DbConnection(){
		String connectioString =String.format("jdbc:sqlserver://%s:%d;databaseName=%s",serverAddress,serverPort,dbName);
		Properties connectionProps=getConnectionProperties();
		try{
		conection = DriverManager.getConnection(connectioString,connectionProps);
		System.out.println("connected!");
		}
		catch(SQLException e){
			System.out.println("could not connect!");
			e.printStackTrace();
		}
	}
	
	public static DbConnection getInstance(){
		if(connect==null){
			connect=new DbConnection();
		}
		return connect;
	}
	
	private Properties getConnectionProperties(){
		Properties connectionProps= new Properties();
		connectionProps.put("user", "dmaj0916_197319");
		connectionProps.put("password", "Password1!");
		return connectionProps;
	}
	
	public Connection getConnection(){
		return conection;	
	}
}