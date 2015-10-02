package com.employeemanagement.dao;

import java.sql.*;
import java.util.ArrayList;

import com.employeemanagement.model.Employee;
import com.jdbc.common.ConnectionFactory;

public class EmployeeDAO {

	public ArrayList<Employee> getAllEmployees()
	{
		ArrayList<Employee> empList = new ArrayList<Employee>();

		Connection connection = ConnectionFactory.getConnection();

		String sql = "SELECT * FROM employee";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			ResultSet rs = stmt.executeQuery();


			while(rs.next())
			{

				Employee emp = new Employee();

				emp.setEmpId(rs.getInt(1));
				emp.setEmpName(rs.getString(2));
				emp.setSalary(rs.getInt(3));
				emp.setDept(rs.getString(4));

				empList.add(emp);

			}



			System.out.println("List size is "+ empList.size());	


		} catch (SQLException e) {

		}


		return empList;

	}

	public boolean deleteEmployee(int empId)
	{
		boolean isDeleted = false;


		Connection connection = ConnectionFactory.getConnection();

		String sql = "DELETE FROM employee where empid = ?";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, empId);

			int noOfRowsEffected = stmt.executeUpdate();

			if(noOfRowsEffected > 0)
			{
				isDeleted = true;
				System.out.println("Deleted successfully , empoye id : "+ empId);
			}

		}
		catch(Exception e)
		{
			System.out.println("Exception e: "+ e.getMessage());
		}


		return isDeleted;


	}
	
	
	public boolean addEmployee(Employee newEmployee)
	{
		boolean isInserted = false;
		
		Connection connection = ConnectionFactory.getConnection();

		String sql = "INSERT INTO employee values (?, ?, ?,?) ";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setInt(1, newEmployee.getEmpId());
			stmt.setString(2, newEmployee.getEmpName());
			stmt.setInt(3, newEmployee.getSalary());
			stmt.setString(4, newEmployee.getDept());
			
			int  rowsEffected = stmt.executeUpdate();
			 
			 if(rowsEffected > 0)
			 {
				 isInserted = true;
			 }
			
			
			
		} 
		catch (SQLException e) {
			
		}
		
		
		return isInserted;	
		
	}
	
	public Employee getEmployeeById(int empId)
	{
		System.out.println("getEmployeeById()");
		Connection connection = ConnectionFactory.getConnection();
		String sql = "Select * from employee where empid = ?";
		Employee emp  = null;
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, empId);
			
			ResultSet rs = stmt.executeQuery();


			while(rs.next())
			{

				 emp = new Employee();

				emp.setEmpId(rs.getInt(1));
				emp.setEmpName(rs.getString(2));
				emp.setSalary(rs.getInt(3));
				emp.setDept(rs.getString(4));

			}



			System.out.println("Employee got from Db   is "+ emp.toString());	
			
			
			
		} catch (SQLException e) {
			System.out.println("Exception :"+ e);
		
		}
		
	return emp;	
		
		
	}
	
	public boolean updateEmployee(Employee emp)
	{
		
boolean isInserted = false;
		
		Connection connection = ConnectionFactory.getConnection();

		String sql = "UPDATE employee SET empname = ?, salary = ?, dept = ? where empid = ?";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setInt(4, emp.getEmpId());
			stmt.setString(1, emp.getEmpName());
			stmt.setInt(2, emp.getSalary());
			stmt.setString(3, emp.getDept());
			
			int  rowsEffected = stmt.executeUpdate();
			 
			 if(rowsEffected > 0)
			 {
				 isInserted = true;
			 }
			
			
			
		} 
		catch (SQLException e) {
			
		}
		
		
		return isInserted;	
		
		
	}
	
	
}
