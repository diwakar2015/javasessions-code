package com.employeemanagement.dao;

import java.sql.*;

import com.employeemanagement.model.User;
import com.jdbc.common.ConnectionFactory;


public class UserDAO {


	public boolean saveUser(User user)
	{

		boolean insertionStatus = false ;
		Connection connection = ConnectionFactory.getConnection();


		String sql = "INSERT INTO user values (?, ? , ? , ? , ?)";

		PreparedStatement statement = null;

		try {
			statement = connection.prepareStatement(sql);

			statement.setString(1, user.getUserName());
			statement.setString(2, user.getPassword());
			statement.setString(3, user.getEmail());
			statement.setString(4, user.getCountry());
			statement.setString(5, user.getGender());


			int noOfRowInsrted = statement.executeUpdate();

			if(noOfRowInsrted > 0)
			{
				System.out.println("User has been created successfully!!");
				insertionStatus = true;

			}




		} catch (Exception e) {
			System.out.println("Exception : "+ e.getMessage());
		}




		return insertionStatus;


	}


	public User getUserbyUserName(String userName)
	{

		User user = null;

		try
		{

			String sql = "SELECT * from user where username= ? ";

			Connection connection = ConnectionFactory.getConnection();
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, userName);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next())
			{
				user = new User();
				user.setUserName(rs.getString(1));
				user.setPassword(rs.getString(2));

			}
			
			
		}
		catch(Exception e)
		{
			return null;
		}


		if(user != null)
		{
			System.out.println("User got from DB : "+ user.getUserName() + " Password : "+ user.getPassword());
		}
		
		return user;

	}














}
