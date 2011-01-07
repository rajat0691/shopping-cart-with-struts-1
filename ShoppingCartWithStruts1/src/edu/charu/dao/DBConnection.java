package edu.charu.dao;
import java.sql.*;


public class DBConnection {

	private java.sql.Connection connection; 
	
	public DBConnection() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
	{
		String connectionURL = "jdbc:mysql://localhost:3306/LOCAL?user=;password=";
    	Class.forName("com.mysql.jdbc.Driver").newInstance();
    	connection = DriverManager.getConnection(connectionURL, "charu", "charu");
	}
	
	public ResultSet executeStatement(String query)
	{
		Statement statement = null;
		ResultSet rs = null;
		try
		{
    	statement = connection.createStatement();
    	rs = statement.executeQuery(query);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return rs;
	}
	
}
