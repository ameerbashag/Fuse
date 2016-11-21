package com.eai.integration.swagger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * @author AKSHAJ
 *
 */

@Path("")
@Api(value = "HelloWorld API")
@Produces({ "application/json", "application/xml" })
public class SwaggerResource {
	@GET
	@Path("/{name}")
	@ApiOperation(value = "Greeting", notes = "Greeting message", response = String.class)
	public String greeting(
			@ApiParam(value = "name that need to be greeted", required = true) @PathParam("name") String name) {
		// this does nothing -- just a shell for CXF and Camel
		String greeting = "Hello " + name;
		return greeting;
	}
}