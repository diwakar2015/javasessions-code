package com.jdbc.example;

import java.sql.*;

import com.jdbc.common.ConnectionFactory;

public class JdbcExample {
	
	public static void main(String[] args) {
		
           Connection conn = null;
           Statement stmt = null;

		   try{
		      
			   conn = ConnectionFactory.getConnection();
		       stmt = ConnectionFactory.getStatement(conn);
		      

		       String  sqlQuery = "select * from student";
		      
		       System.out.println("Executing the query");
		      //Step: 4
		      ResultSet rs = stmt.executeQuery(sqlQuery);

		      
		      System.out.println("Record retrieved from student database: \n\n");
		      //STEP 5: Extract data from result set
		      while(rs.next()){
		    	  
		         //Retrieve by column name
		    	 int rollNumber =  rs.getInt(1);
		    	 String name = rs.getString(2);
		    	 String email = rs.getString(3);
		    	 
		    	
		    	 
		    	 System.out.println("Roll : "+ rollNumber + " Name: "+ name +  " E-Mail : "+ email);
		    	  
		    	  
		         
		      }
		      //STEP 6: Clean-up environment
		      rs.close();
		      stmt.close();
		      conn.close();
		   }
		   catch(Exception e)
		   {
			   System.out.println("Exception caught while working with JDBC"+ e);
		   }
		
		
		
		
	}
	

}
