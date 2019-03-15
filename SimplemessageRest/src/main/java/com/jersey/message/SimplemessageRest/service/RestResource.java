package com.jersey.message.SimplemessageRest.service;

import java.util.List;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.jersey.message.SimplemessageRest.Messages;
import com.jersey.message.SimplemessageRest.ServiceMessage;





@Path("/messages")

public class RestResource {
	
	ServiceMessage msg=new ServiceMessage();
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List <Messages> getResource() {
		return msg.getAllmessages();
	}

}