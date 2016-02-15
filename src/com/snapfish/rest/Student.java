package com.snapfish.rest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="student")
public class Student {
	
	private int sno;
	private String sname;
	private double marks;
	
	// It is mandatory to declare default constructor.
	Student(){
		
	}
	
	Student(int sno, String sname, double marks){
		this.sno = sno;
		this.sname = sname;
		this.marks = marks;
	}
	
	@XmlElement(name="studNumber")
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	
	@XmlElement(name="studName")
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	@XmlElement(name="studMarks")
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	

}
