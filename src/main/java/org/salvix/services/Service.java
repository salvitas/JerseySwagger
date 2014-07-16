package org.salvix.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.salvix.models.Phone;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

@Path("/phone")
@Api(value = "/phone", description = "Operations about Phones")
@Produces({ "application/json" })
public class Service {

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Find all Phones", notes = "More notes about this method", response = Phone.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK"),
			@ApiResponse(code = 500, message = "Something wrong in Server"),
			@ApiResponse(code = 404, message = "Phone not found") })
	public Phone getPhoneInJSON() {
		Phone p = new Phone();
		p.setBrand("iPhone");
		p.setModel("5C");
		return p;

	}
}
