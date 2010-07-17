package net.anilmathew.play.scwcd;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class SimpleServletFilter implements Filter {

	private String version;

	public void destroy() {
		SimpleServlet.log.info("SimpleServletFilter destroyed");
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		SimpleServlet.log.info("SimpleServletFilter hit");
		if (req.getRequestURL().toString().endsWith(".log")){
			SimpleServlet.log.info("SimpleServletFilter Version : " + version + " denied");
			PrintWriter writer = response.getWriter();
			response.setContentType("text/html");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/accessDenied");
			writer.print("Access denied");
			requestDispatcher.include(request, response);
		} else{
			SimpleServlet.log.info("SimpleServletFilter allowed");
			chain.doFilter(request, response);
		}
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		SimpleServlet.log.info("SimpleServletFilter init");
		version = filterConfig.getInitParameter("version");
	}

}
