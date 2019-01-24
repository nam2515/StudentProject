package com.BL;

public class Courses {
	private int no_of_courses;
	private String courseid, coursename;
	public Courses(String courseid, String coursename)
	{
		super();
		this. courseid=courseid;
		this.coursename=coursename;
	}
	public String getCourseId()
	{
		return courseid;
	}
	public void setCourseId(String courseid)
	{
		this.courseid=courseid;
	}
	public String getCourseName()
	{
		return coursename;
	}
	public void setStudName(String coursename)
	{
		this.coursename=coursename;
	}
	


}
