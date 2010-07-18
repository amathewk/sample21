package net.anilmathew.play.scwcd;

import java.util.logging.Logger;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SimpleSessionListener implements HttpSessionListener {

	Logger log = SimpleServlet.log;
	
	public void sessionCreated(HttpSessionEvent se) {
		log.info("sessionCreated");
	}

	public void sessionDestroyed(HttpSessionEvent se) {
		log.info("sessionDestroyed");
	}

}
