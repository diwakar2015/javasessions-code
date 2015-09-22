package sampleproject;

public class Employee extends Manager{

	
	public void showAssignedWorkItem()
	{
		System.out.println("I am inside method.showAssignedWorkItem()");
		System.out.println("Showing work items....");
	}
	
	public int add(int num1, int num2)
	{
		int sum =  num1 + num2;
		
		return sum;
	}
	
	
}

