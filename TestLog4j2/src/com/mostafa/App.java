package com.mostafa;

import org.apache.log4j.Logger;

import com.mostafa.gui.MainFrame;
import com.mostafa.gui.MessageSender;






public class App {
	
	static Logger logger = Logger.getLogger(App.class);
	

	public static void main(String[] args) {
		
		
		MainFrame frame = new MainFrame();
		
		
		delay();

		logger.info("Hello World");
		
		delay();

		logger.info("Hello World again");
		delay();
		logger.info("Hello World again");
		delay();
		logger.info("Hello World again");
	}
	
	public static void delay() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
