package net.anilmathew.play.scwcd;

import java.util.logging.Logger;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class Pojo implements HttpSessionBindingListener {

	private Logger log = SimpleServlet.log;
	
	public static String SomeString = "some";

	private String name = "name";

	public Pojo(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void valueBound(HttpSessionBindingEvent event) {
		log.info("BOUND: " + event.getValue().toString());
	}

	public void valueUnbound(HttpSessionBindingEvent event) {
		log.info("UNBOUND: " + event.getValue().toString());
	}

	@Override
	public String toString() {
		return name;
	}
}
