package com.roshan.messenger.service;

import java.util.ArrayList;
import java.util.List;

import com.roshan.messenger.model.Message;

public class MessageService {

	public List<Message> allMessages(){
		Message m1 = new Message(1, "Hello", "Roshan");
		Message m2 = new Message(1, "Hello D", "R");
		List<Message> list = new ArrayList<Message>();
		list.add(m1);
		list.add(m2);
		return list;
		}
	
}
