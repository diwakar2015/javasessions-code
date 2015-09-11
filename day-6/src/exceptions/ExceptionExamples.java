package exceptions;

import java.util.Date;

public class ExceptionExamples {

	public static void main(String[] args) {

		try
		{
			int a = 10;
			int b = 0;
			
			int c = a/b;  // Here Arithmatic Exception
			
			ABC obj =  null;

			obj.display();
			
		}
		
		catch (NullPointerException e) {
			System.out.println("Exce "+ e.getMessage());
		}
		
			
		catch(Exception e)
		{
			System.out.println("Exception caught : "+ e.getMessage());
		}
		
		System.out.println("I am okay'");
		System.out.println("Today date is "+ new Date().toString());
	}
	
		
		

	}





class ABC
{
	public void display()
	{
		System.out.println("I am display function in ABC class");
	}

}