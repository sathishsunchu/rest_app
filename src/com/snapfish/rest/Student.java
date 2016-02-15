package com.snapfish.rest;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="student")
@XmlRootElement(name="student")
public class Student {
	
	private int sno;
	private String sname;
	private String course;
	private double fee;
	private int mobile;
	
	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	// It is mandatory to declare default constructor.
	Student(){
		
	}
	
	Student(int sno, String sname, String course, double fee, int mobile){
		this.sno = sno;
		this.sname = sname;
		this.course = course;
		this.fee = fee;
		this.mobile = mobile;
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
}
