package exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompileTime {
	
	public static void main(String[] args) throws IOException  {
		
		CompileTime.takeInputFromUser();
	
		
		
	}


	public static void takeInputFromUser() throws IOException 
	{
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = "";
		System.out.println("Enter your name ");
		
	name  = br.readLine();
		
		System.out.println("Entered name "+ name);
	}
}
