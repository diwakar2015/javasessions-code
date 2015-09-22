package sampleproject;

import java.util.Date;

public class Manager {
	
	
	public void showEmplyeeDetails()
	{
		System.out.println("Showing employee details");
	}
	
	public int seeEmployeeSalary()
	{
		
		int salary = 5000;
		//System.out.println("Employee salary is "+ 5000);
		return salary;
	}
	
	public String getDOJ()
	{
		Date dt = new Date();
		//System.out.println("your DOj is "+ dt.toString());
		
		return dt.toString();
	}
	
	private void assignWork()
	{
		System.out.println("Manager is assigning the work item...");
	}
	
	
	public static void main(String[] args) {
		
		
		Manager m = new Manager();
		m.assignWork();
		m.seeEmployeeSalary();
		m.showEmplyeeDetails();
		m.getDOJ();
		
		
	}
	
}
