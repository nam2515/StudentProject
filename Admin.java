package com.Admin;
import java.util.Scanner;

import com.BL.Student;
import com.Scheduler.StudentScheduler;

public class Admin {
	private static StudentScheduler stdsch=new StudentScheduler();
	private static Scanner sc=new Scanner(System.in);
	public static void main(String [] args ) {
	int choice;
	while(true)
	{
		System.out.println("1. Add Student");
		System.out.println("2. Show all Student");
		System.out.println("3. Show student by roll number");
		System.out.println("4. Exit");
		System.out.println("Enter your choice");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1: System.out.println(stdsch.addStudent());
				break;
		case 2: System.out.println("Rollnumber"+" "+ "Name"+" "+" Courseid"+" "+ " Coursename" );
				System.out.println(stdsch.showAllStudent());
				break;
		case 3: System.out.println("Rollnumber"+" "+ "Name"+" "+" Courseid"+" "+ " Coursename" );
				System.out.println(stdsch.byRollNumber());
				break;
		case 4: System.exit(0);
		default: System.out.print("You've entered a wrong choice");
		}
	}
	}

}
