package net.anilmathew.play.scwcd;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResponseManipulatorServlet extends HttpServlet {
	
	public void init(ServletConfig servletConfig) {
		SimpleServlet.log.info(servletConfig.getServletName() + "initialized");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		PrintWriter writer = resp.getWriter();
		
		writer.write("<html>");
		writer.write("<body>");
		
		resp.setStatus(resp.SC_ACCEPTED);
		resp.addHeader("randomHeader", "randValue");
		
		writer.write("should not see.");
		resp.resetBuffer();
		writer.write("should see.");
		
		writer.write("</body>");
		writer.write("</html>");
	}

}
