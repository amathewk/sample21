package net.anilmathew.play.scwcd;

import java.util.logging.Logger;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

public class SimpleRequestAttributeListener implements
		ServletRequestAttributeListener {

	Logger log = SimpleServlet.log;
	
	public void attributeAdded(ServletRequestAttributeEvent srae) {
		log.info("Attribute Added : " + srae.getName());
		log.info("Attribute Added : " + srae.getValue().toString());
	}

	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		log.info("Attribute Removed : " + srae.getName());
		log.info("Attribute Removed : " + srae.getValue().toString());
	}

	public void attributeReplaced(ServletRequestAttributeEvent srae) {
		log.info("Attribute Replaced : " + srae.getName());
		log.info("Attribute Replaced : " + srae.getValue().toString());
	}

}
