package net.anilmathew.play.scwcd;

import java.util.logging.Logger;

import org.apache.catalina.SessionEvent;
import org.apache.catalina.SessionListener;

public class SimpleSessionListener implements SessionListener {

	Logger log = SimpleServlet.log;
	
	public void sessionEvent(SessionEvent event) {
		log.info("Session Event : " + event.getSession());

	}

}
