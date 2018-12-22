package com.roshan.allResources;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/myform")
public class FormResource {

	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public String userValidation(@FormParam ("userName") String userName, @FormParam ("password") String password){
		if(userName.equals("Roshan") && password.equals("roshan"))
		{return "Valid User";
		}
		else{
		return "Invalid User";
		}
		}
	}
	

