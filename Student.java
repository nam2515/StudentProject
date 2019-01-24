package com.BL;

public class Student {
	private int rollnumber;
	private String studname;
	private Courses[] courses;
	public Student(int rollnumber, String studname, Courses []courses) {
		super();
		this.rollnumber=rollnumber;
		this.studname=studname;
		this.courses=courses;
	}
	public int getRollNumber()
	{
		return rollnumber;
	}
	public void setRollNumber(int rollnumber)
	{
		this.rollnumber=rollnumber;
	}
	public String getStudName()
	{
		return studname;
	}
	public void setStudName(String studname)
	{
		this.studname=studname;
	}
	public Courses[] getCourses()
	{
		return courses;
	}
	public void setCourses(Courses []courses)
	{
		this.courses=courses;
	}

	
}
