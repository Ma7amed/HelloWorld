package com.mostafa.gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame  {

	JTextArea text;

	public MainFrame() {

		text = new JTextArea();
		
		MessageSender.getMessageSender().addListener(new MessageListener() {
			
			public void newMessage(String message) {
				System.out.println("I got a new Message: "+ message);
				text.append(message + "\n");
			}
		});
		
		setSize(400, 400);
		setLayout(new BorderLayout());
		getContentPane().add(text, BorderLayout.CENTER);
		setVisible(true);

	}


}
