package com.roshan.allResources;



import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.roshan.springREST.AssingmentsOnRest.Question3.resources.Address;
import com.roshan.springREST.AssingmentsOnRest.Question3.resources.AddressDAO;

@Path("userAddress")
public class AddressResource {
	
	AddressDAO addressDAO = new AddressDAO();

	@GET
	@Path("{zip}")
	@Produces(MediaType.APPLICATION_JSON)
	public Address getUserAddress(@PathParam("zip") long zip){
		return addressDAO.getUserAddress(zip);
		
	}
	
}
