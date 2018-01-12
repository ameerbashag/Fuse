package com.eai.integration;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.eai.integration.bo.Employee;

@Path("/")
public class EmployeeServiceResource {

	public EmployeeServiceResource() {
	}

	@GET
	@Path("/employees/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Employee getCustomer(@PathParam("name") String name) {
		Employee emp = new Employee();
		emp.setId("E123");
		emp.setName(name);
		emp.setDept("IT");
		return emp;
	}

}