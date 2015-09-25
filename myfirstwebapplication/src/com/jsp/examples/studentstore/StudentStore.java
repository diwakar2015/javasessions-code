package com.jsp.examples.studentstore;

import java.util.ArrayList;

import com.jsp.examples.model.Student;


public class StudentStore {
	
	private  static StudentStore _instance = new StudentStore();
	
	private final ArrayList<Student> list = new ArrayList<Student>();
	
	public static StudentStore getInstance()
	{
		return _instance;
		
	}
	

	public void registerStudent(Student newStudent)
	{
		list.add(newStudent);		
	}
	
	
	public ArrayList<Student> getListOfStudents()
	{
		return list;
	}

}
