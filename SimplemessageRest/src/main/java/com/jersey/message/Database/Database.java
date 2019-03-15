package com.jersey.message.Database;

import java.util.HashMap;
import java.util.Map;

import com.jersey.message.SimplemessageRest.Messages;
import com.jersey.message.SimplemessageRest.Profile;


public class Database {
	private static Map<Long,Messages> messages=new HashMap<>();
	private static Map<Long,Profile> profile=new HashMap<>();
	
	public static Map<Long,Messages>getmessages(){
		return messages;
	}
	public static Map<Long,Profile>getAllmessages(){
		return profile;
	}
}
