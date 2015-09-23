package com.jdbc.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.jdbc.common.ConnectionFactory;
import com.jdbc.mainapp.MainApp;

public class StudentDAO {



	public static void insertStudentRecord()
	{
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		Statement stmt = null;

		try{

			conn = ConnectionFactory.getConnection();
			stmt = ConnectionFactory.getStatement(conn);


			System.out.println("Enter the rollNumber");
			int roll = sc.nextInt();
			System.out.println("Enter the name");
			String name = sc.next();
			System.out.println("Enter the email");
			String email = sc.next();

			String  sqlQuery = "INSERT into student (rollnumber,name,email) values ('"+roll + "','"+ name+ "','"+email + "')";

			System.out.println("SQL Query : "+ sqlQuery);

			System.out.println("Inserting into the database");
			//Step: 4
			int rowInserted = stmt.executeUpdate(sqlQuery);

			if(rowInserted > 0)
			{
				System.out.println("Inserted successfully");
				MainApp.displayMainMenu();
			}

			MainApp.displayMainMenu();

		}
		catch(Exception e)
		{
			System.out.println("Exception: "+ e);
			MainApp.displayMainMenu();
		}


	}


	public static void deleteAStudent(int rollNumber)
	{


		try {
			Connection conn = ConnectionFactory.getConnection();
			Statement stmt = ConnectionFactory.getStatement(conn);

			String sqlQuery = "DELETE from student where rollnumber="+rollNumber;
			System.out.println("SQl Query : "+ sqlQuery);

			int noOfRowsDeleted = stmt.executeUpdate(sqlQuery);

			if(noOfRowsDeleted > 0)
			{
				System.out.println("Student record deleted with rollNumber "+ rollNumber);
				MainApp.displayMainMenu();
			}

		} catch (SQLException e) {
			MainApp.displayMainMenu();
		}


		MainApp.displayMainMenu();


	}


	public static void displayAllStudents()
	{

		Connection conn = null;
		Statement stmt = null;

		try{

			conn = ConnectionFactory.getConnection();
			stmt = ConnectionFactory.getStatement(conn);


			String  sqlQuery = "select * from student";


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
			MainApp.displayMainMenu();
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

	public static void updateStudent(int rollNumber)
	{
		String sqlQuery = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("What field do you want to change? Press 1 for name & Press 2 for email or press 3 to go back to the main menu");
		int ch = sc.nextInt();
		
		if(ch==1)
		{
			System.out.println("Enter the new name");
			String name = sc.next();
			
			sqlQuery = "update student set name='"+name+"' where rollnumber="+ rollNumber;
			
		}
		
		else if (ch==2)
		{
			System.out.println("Enter the new email id");
			String email = sc.next();
			
			sqlQuery = "update student set email='"+email+"' where rollnumber="+ rollNumber;
			
			
		}
		
		else
		{
			MainApp.displayMainMenu();
		}
		
		System.out.println("SQL Query : "+ sqlQuery);
		
		Connection conn = ConnectionFactory.getConnection();
		Statement stmt = ConnectionFactory.getStatement(conn);
		
		try {
			int updatedRoqCount = stmt.executeUpdate(sqlQuery);
			if(updatedRoqCount > 0)
			{
				System.out.println("Student updated successfully!!");
				MainApp.displayMainMenu();
			}
			
		} catch (SQLException e) {
			MainApp.displayMainMenu();
		}
		MainApp.displayMainMenu();

	}



}
