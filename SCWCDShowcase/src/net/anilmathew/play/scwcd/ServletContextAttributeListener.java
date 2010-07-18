package net.anilmathew.play.scwcd;

import java.util.logging.Logger;

import javax.servlet.ServletContextAttributeEvent;

public class ServletContextAttributeListener implements
		javax.servlet.ServletContextAttributeListener {

	Logger log = SimpleServlet.log;
	
	public void attributeAdded(ServletContextAttributeEvent scab) {
		log.info("context attributeAdded" + scab.getName() + " = " + scab.getValue());

	}

	public void attributeRemoved(ServletContextAttributeEvent scab) {
		log.info("context attributeRemoved" + scab.getName() + " = " + scab.getValue());

	}

	public void attributeReplaced(ServletContextAttributeEvent scab) {
		log.info("context attributeReplaced" + scab.getName() + " = " + scab.getValue());

	}

}
