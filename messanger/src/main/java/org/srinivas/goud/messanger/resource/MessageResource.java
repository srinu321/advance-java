package org.srinivas.goud.messanger.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.srinivas.goud.messanger.model.Messages;
import org.srinivas.goud.messanger.service.MessageService;

@Path("/messages")
public class MessageResource {
	MessageService msg = new MessageService();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Messages> getMessage(){
		return msg.getallMessages();
	}	
	@GET
	@Path("/{te}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getest(){
		return"hello man";
	}
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public String addest(){
		return "not";
	}

}
