package com.snapfish.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/student")
public class StudentResource {
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Student getStudent(){
		Student s = new Student(100, "Sathish", "Java", 5000.00, 12345679);
		return s;
	}
	
}
