package com.Scheduler;

import java.util.Scanner;
import com.BL.Courses;
import com.BL.Student;

public class StudentScheduler {
	private Scanner sc= new Scanner(System.in);
	private Student [] students=new Student[10];
	private int count=0;

// adding the student details
	
	public String addStudent() {
		int rollnumber, no_of_courses = 0;
		String studname, coursename, courseid;
		System.out.println("Enter the Student rollnumber: ");
		rollnumber=sc.nextInt();
		for(int i=0;i<count;i++)
		{
		if(rollnumber==students[i].getRollNumber()) {
			return ("Sorry the Roll number is already taken!!");
		}
		}
		System.out.println("Enter the Student name: ");
		studname=sc.next();
		System.out.println("Enter the Number of courses student want to enroll: ");
		no_of_courses=sc.nextInt();
		Courses [] courses=new Courses[no_of_courses];
		for(int i=0;i<no_of_courses;i++)
		{
			System.out.println("Enter the course id: ");
			courseid=sc.next();
			System.out.println("Enter the course name:");
			coursename=sc.next();
			Courses object=new Courses(courseid, coursename);
			courses[i]=object;
		}		
		students[count++]=new Student(rollnumber, studname, courses);
		return "Student added successfully";	
	}
	

	public String byRollNumber() {
		// TODO Auto-generated method stub
		int value;
		String output = null;
		System.out.println("Enter the roll number you want to search.");
		value=sc.nextInt();
		for(int i=0;i<count;i++)
		{
			if(value==students[i].getRollNumber() && students[i].getStudName()!=null)
			{
				output=students[i].getRollNumber()+ "  "+ students[i].getStudName()+ " ";
				for(int j=0;j<students[i].getCourses().length;j++)
				{
					output+=" "+students[i].getCourses()[j].getCourseId()+" "+students[i].getCourses()[j].getCourseName();
				}
				
			}
			else
				output="Match NOT Found";
		}
		return output;
	}


	public String showAllStudent() {
		String output = null;
		for(int i=0;i<count;i++)
		{	
			output=students[i].getRollNumber()+ "\t "+ students[i].getStudName()+"\t ";
			for(int j=0;j<students[i].getCourses().length;j++)
			{
				output+=" "+ students[i].getCourses()[j].getCourseId()+"\t "+students[i].getCourses()[j].getCourseName();
			}
		}
		return output;
	}
	



	

}
