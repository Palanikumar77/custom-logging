package com.example.demo;

import org.apache.log4j.Level;
import org.apache.log4j.spi.Filter;
import org.apache.log4j.spi.LoggingEvent;

public class MyLog4jFilter extends Filter {

	/**
	 * My custom filter to only log INFO and CRUNCHIFY events
	 */
	@Override
	public int decide(LoggingEvent event) {
		
		if(event.getLevel() == Level.INFO ||  event.getLevel() == CrunchifyLog4jLevel.CRUNCHIFY )
		return ACCEPT;
		else return DENY;
	}

}
