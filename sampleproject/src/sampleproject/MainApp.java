package sampleproject;

public class MainApp {
	

	public static void main(String[] args) {
		
		System.out.println("I am starting here....");
		
		
		
		Employee e = new Employee();
		
		
		e.showAssignedWorkItem();
		String doj = e.getDOJ();
		
		System.out.println("My DOJ is "+ doj);
		
		int mysalary = e.seeEmployeeSalary();
		
		System.out.println("Got the salary : "+ mysalary);
		
		e.showEmplyeeDetails();	
		
		
		int sum = e.add(10, 20);
		
		System.out.println("Sum is "+ sum);
	   

		System.out.println("End.....");
		
		
		}
	

}


// acc-sp return-type methodName (Arugemtns)
//{
	
//}