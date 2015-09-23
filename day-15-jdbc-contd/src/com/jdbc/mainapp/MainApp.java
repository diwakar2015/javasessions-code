package com.jdbc.mainapp;

import java.util.Scanner;

import com.jdbc.dao.StudentDAO;

public class MainApp {
	
	
	public static void main(String[] args) {
		
		displayMainMenu();
		
	}
	
	public static void displayMainMenu()
	{
            Scanner sc = new Scanner(System.in);
	
            
            System.out.println("\n\n\n<< ========== Student Database Application ===================>>");
			System.out.println("Press 1 . To insert the student data into the DB");
			System.out.println("Press 2 . To delete a record from the db");
			System.out.println("Press 3 . To display the all students in the db");
			System.out.println("Press 4. To update a record");
			System.out.println("Press 5 . Exit from App");
			
			
			int choice = sc.nextInt();
			
			
			switch(choice)
			{
			
			case 1:
				   StudentDAO.insertStudentRecord();
				break;
				
			case 2:
				System.out.println("Enter the roll number of the student to delete a record");
				int roll = sc.nextInt();
				  StudentDAO.deleteAStudent(roll);
				break;
				
			case 3:
				 StudentDAO.displayAllStudents();
				break;
			case 4:
				System.out.println("Enter the roll number of the student upate");
				int rollNumber = sc.nextInt();
				 StudentDAO.updateStudent(rollNumber);
				
			case 5:
				System.exit(0);
				
			default:
				 System.out.println("Wrong Choice");
				 displayMainMenu();
				 break;
			
			
			
			
			}
			
			
			

	}
	
	
}
