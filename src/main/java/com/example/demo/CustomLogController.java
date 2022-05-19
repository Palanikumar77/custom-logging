package com.example.demo;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomLogController {
	Logger logger = Logger.getLogger(CustomLogController.class);
	
	@GetMapping("/log")
	public String getcustomLog() {
		//DOMConfigurator.configure("log4j.xml");
		for(int i=0; i<100; i++) {
			logger.log(CrunchifyLog4jLevel.CRUNCHIFY, "I am CrunchifyLog4jLevelTest log");
			logger.log(Level.DEBUG, "I am a DEBUG message");
		}
		
		
		return "Custom Log";
	}
}
