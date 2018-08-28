package com.capgemini.day5.domain;

import com.capgemini.day5.exception.AgeNotWithinRangeException;
import com.capgemini.day5.exception.NameNotValidException;
public class Student {
private long studentrollno;
private int studentage;
private String studentName;
private String studentCourse;


public Student() {
	super();
}


public Student(long studentrollno, int studentage, String studentName, String studentCourse) {
	super();
	this.studentrollno = studentrollno;
	this.studentage = studentage;
	this.studentName = studentName;
	this.studentCourse = studentCourse;
}


public long getStudentrollno() {
	return studentrollno;
}


public void setStudentrollno(long studentrollno) {
	this.studentrollno = studentrollno;
}


public int getStudentage() {
	return studentage;
}


public void setStudentage(int studentage) {
	this.studentage = studentage;
}


public String getStudentName() {
	return studentName;
}


public void setStudentName(String studentName) {
	this.studentName = studentName;
}


public String getStudentCourse() {
	return studentCourse;
}


public void setStudentCourse(String studentCourse) {
	this.studentCourse = studentCourse;
}
public static boolean checkAge(int studentage)throws AgeNotWithinRangeException{
	if(studentage>15 && studentage<21) {
		return true;
		else
			throw new AgeNotWithinRangeException("Incorrect age");
		
	}
}
public boolean checkName(String studentName)throws NameNotValidException{
	if(this.studentName==studentName) {
		return true;
		else
			throw new NameNotValidException("Incorrect NAME");
	}
}
}
