package com.Spring;

public class Student {
	private String studentName;
	private String studentAge;
	private String deptName;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(String studentAge) {
		this.studentAge = studentAge;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	public void displayInfo(){  
	    System.out.println("name: "+studentName+ "age: " +studentAge+ "deptname: " +deptName);  
	}  
	

}
