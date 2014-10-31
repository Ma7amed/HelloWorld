package com.mostafa.gui;

import java.util.ArrayList;

import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.spi.LoggingEvent;

public class MessageSender extends AppenderSkeleton {

	ArrayList<MessageListener> listener;
	static MessageSender me;
	
	public MessageSender() {
		
		listener = new ArrayList<MessageListener>();
		this.me = this;
	}
	
	
	public static MessageSender getMessageSender() {
		return me;
	}

	public void addListener(MessageListener listener) {
		System.out.println("Adding new listener" + listener);
		this.listener.add(listener);
	}

	public void removeListener(MessageListener listener) {
		if (this.listener.contains(listener)) {
			this.listener.remove(listener);
		}
	}

	public void close() {
		// TODO Auto-generated method stub

	}

	public boolean requiresLayout() {
		// TODO Auto-generated method stub
		return false;
	}

	protected void append(LoggingEvent arg0) {
		// TODO Auto-generated method stub
		if(listener.size()==0) 
			return;
		for(MessageListener list: listener) {
			list.newMessage(arg0.getMessage().toString());
		}

	}

}
