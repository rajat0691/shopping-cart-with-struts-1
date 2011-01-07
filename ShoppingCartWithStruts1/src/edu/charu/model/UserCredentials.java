package edu.charu.model;

import java.sql.ResultSet;

import edu.charu.dao.DBConnection;

public class UserCredentials {

public boolean authenticateUser(String username, String password)
{
	try
	{
		DBConnection dbConn = new DBConnection();
		String str = "select * from users where username='" 
			+ username+ "' and userpassword = '" + password +"'";
		ResultSet rs = dbConn.executeStatement(str);
	
	if(rs.next() && username.equalsIgnoreCase(rs.getString("username")))
	{
		return true;
	}
	else
	{
		return false;
	}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return false;
}
	
}
