package com.database;

import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;

public class DataBaseConnection {
private static Connection con;
	
	public static Connection getConnection()
	{
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "orcl11g");
		} 
		catch (ClassNotFoundException |SQLException e)
		{
			e.printStackTrace();
		}
		
		return con;	
	}
		
}
