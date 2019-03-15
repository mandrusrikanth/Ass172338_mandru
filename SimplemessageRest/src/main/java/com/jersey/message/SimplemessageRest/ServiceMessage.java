package com.jersey.message.SimplemessageRest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.jersey.message.Database.Database;


public class ServiceMessage {
	private Map<Long,Messages>messages=Database.getmessages();
	
	public ServiceMessage() {
		messages.put((long) 101, new Messages(1,"Hello world","sri"));
		messages.put((long) 102, new Messages(2,"Hello","mandru"));
	}
	
	public List<Messages> getAllmessages(){
		return new ArrayList<Messages>(messages.values());
	}
	public Messages getmessage(long id) {
		return messages.get(id);
		
	}
	public Messages addmessage(Messages msg) {
	msg.setId(messages.size()+1);
    messages.put(msg.getId(),msg);
    return msg;
}
	public Messages UpdateMessage(Messages msg) {
		if(msg.getId() <=0) {
			return null;
		}
		messages.put(msg.getId(),msg);
			return msg;
		}
	
	public Messages RemoveMessage(long id) {
		return messages.remove(id);
	}
}