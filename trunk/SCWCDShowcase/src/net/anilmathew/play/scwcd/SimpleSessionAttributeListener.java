package net.anilmathew.play.scwcd;

import java.util.logging.Logger;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class SimpleSessionAttributeListener implements
		HttpSessionAttributeListener {

	Logger log = SimpleServlet.log;
	
	public void attributeAdded(HttpSessionBindingEvent se) {
		
		log.info("sessionAttrAdded:" + se.getName());
		log.info("sessionAttrAdded:" + se.getSource().toString());
		log.info("sessionAttrAdded:" + se.getValue().toString());
	}

	public void attributeRemoved(HttpSessionBindingEvent se) {

		log.info("sessionAttrRemoved:" + se.getName());
		log.info("sessionAttrRemoved:" + se.getSource().toString());
		log.info("sessionAttrRemoved:" + se.getValue().toString());
	}

	public void attributeReplaced(HttpSessionBindingEvent se) {

		log.info("sessionAttrReplaced:" + se.getName());
		log.info("sessionAttrReplaced:" + se.getSource().toString());
		log.info("sessionAttrReplaced:" + se.getValue().toString());
	}

}
