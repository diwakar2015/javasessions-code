package com.jdbc.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionFactory {
	
	private static Connection connection = null;
	
	public static Connection getConnection()
	{
		if(connection == null)
		{
			try{
			      //STEP 1: Register JDBC driver
			      Class.forName(JDBCConnectionPropperties.DRIVER_NAME);

			      //STEP 2: Open a connection
			      System.out.println("Connecting to database...");
			      connection = DriverManager.getConnection(JDBCConnectionPropperties.URL,JDBCConnectionPropperties.USER_NAME,JDBCConnectionPropperties.PASSWORD);
			      
			      
			 }
			 catch(Exception e)
			 {
				 System.out.println("Exception : "+ e);
			 }
			
			
		}
		
		 return connection;
		
	}
	
	public static Statement getStatement(Connection connection)
	{
		Statement stmt = null;
		try {
			stmt = connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stmt;
	}

}
