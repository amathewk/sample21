package net.anilmathew.play.scwcd;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SimpleServlet extends HttpServlet {
	
	
	static Logger log = Logger.getAnonymousLogger();
	
	private static String mode = "text";
	
	public void init(ServletConfig servletConfig) {
		mode = servletConfig.getInitParameter("mode");
		log.info(servletConfig.getServletName() + "initialized");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		Cookie cookie = new Cookie("newcookieName", "newcookieValue");
		cookie.setMaxAge(0);
		resp.addCookie(cookie);

		HttpSession session = req.getSession(true);

		req.getSession().getServletContext().setAttribute("PRODUCTION", true);
		
		req.getSession().removeAttribute("pp");
		session.setAttribute("pp", new Pojo("1"));
		
		if ("text".equalsIgnoreCase(mode)) {
			PrintWriter writer = resp.getWriter();
			writer.write("Simple Servlet Output : ");
		} else if ("binary".equalsIgnoreCase(mode)) {
			OutputStream outputStream = resp.getOutputStream();
			byte[] content = {0,1,1,0};
			outputStream.write(content);
		}
//		session.invalidate();
		
	}
}