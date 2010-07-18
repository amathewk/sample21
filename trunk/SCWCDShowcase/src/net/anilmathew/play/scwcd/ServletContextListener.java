package net.anilmathew.play.scwcd;

import java.util.logging.Logger;

import javax.servlet.ServletContextEvent;

public class ServletContextListener implements
		javax.servlet.ServletContextListener {

	Logger log = SimpleServlet.log;
	
	public void contextDestroyed(ServletContextEvent sce) {
		log.info("contextDestroyed : " + sce.getServletContext());

	}

	public void contextInitialized(ServletContextEvent sce) {
		log.info("contextInitialized : " + sce.getServletContext());

	}

}
