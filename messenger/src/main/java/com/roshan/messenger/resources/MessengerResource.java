package com.roshan.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.roshan.messenger.model.Message;
import com.roshan.messenger.service.MessageService;

@Path("messages")
public class MessengerResource {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages(){
		MessageService service = new MessageService();
		return service.allMessages();
		
	}
	
}
