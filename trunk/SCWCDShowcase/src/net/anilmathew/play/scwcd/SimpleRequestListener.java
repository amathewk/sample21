package net.anilmathew.play.scwcd;

import java.util.logging.Logger;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;

public class SimpleRequestListener implements ServletRequestListener {

	Logger log = SimpleServlet.log;
	
	public void requestDestroyed(ServletRequestEvent sre) {
		log.info("Request Destroyed : " + ((HttpServletRequest)sre.getServletRequest()).getRequestURI());
	}

	public void requestInitialized(ServletRequestEvent sre) {
		log.info("Request Initialized : " + ((HttpServletRequest)sre.getServletRequest()).getRequestURI());
	}

}