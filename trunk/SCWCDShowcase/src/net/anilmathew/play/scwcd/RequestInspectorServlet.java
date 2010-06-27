package net.anilmathew.play.scwcd;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestInspectorServlet extends HttpServlet {
	
	public void init(ServletConfig servletConfig) {
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		PrintWriter writer = resp.getWriter();
		
		writer.write("<html>");
		writer.write("<body>");
		writer.write("getServletPath : " + req.getServletPath() + "<br/>");
		writer.write("getScheme : " + req.getScheme() + "\n");
		writer.write("getServerPort : " + req.getServerPort() + "<br/>");
		writer.write("getServerName : " + req.getServerName() + "<br/>");
		writer.write("</body>");
		
		writer.write("<pre>");
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("req.getRequestURI()=" + req.getRequestURI() + "\nreq.getRequestURL()=" + req.getRequestURL() + "\nreq.getAuthType()=" + req.getAuthType() + "\n");
		sb.append("req.getContentLength()=" + req.getContentLength() + "\nreq.getContentType()=" + req.getContentType() + "\nreq.getContextPath()=" + req.getContextPath());
		sb.append("\nreq.getQueryString()=" + req.getQueryString() + "\nreq.getPathInfo()=" + req.getPathInfo() + "\nreq.getPathTranslated()=" + req.getPathTranslated());
		sb.append("\nreq.getProtocol()=" + req.getProtocol() + "\nreq.getLocalName()=" + req.getLocalName() + "\nreq.getLocalAddr()=" + req.getLocalAddr());
		sb.append("\nreq.getRemoteHost()=" + req.getRemoteHost() + "\nreq.getRemoteAddr()=" + req.getRemoteAddr() + "\nreq.getRemotePort()=" + req.getRemotePort() + "\nreq.getRemoteUser()=" + req.getRemoteUser());
		
		req.setAttribute("country", "GHANA");
		
		sb.append("\n\nAttributes : \n");

		Enumeration attributeNames = req.getAttributeNames();
		while(attributeNames.hasMoreElements()) {
			String attrName = (String) attributeNames.nextElement();
			sb.append(attrName + "=" + req.getAttribute(attrName) + "\n");
		}
		
		sb.append("\n\nParameters : \n");

		Enumeration parameterNames = req.getParameterNames();
		while(parameterNames.hasMoreElements()) {
			String paramName = (String) parameterNames.nextElement();
			sb.append(paramName + "=" + req.getParameter(paramName) + "\n");
		}
		
		
		sb.append("\n\nHeaders : \n");

		Enumeration headerNames = req.getHeaderNames();
		while(headerNames.hasMoreElements()) {
			String headerName = (String) headerNames.nextElement();
			sb.append(headerName + "=" + req.getHeader(headerName) + "\n");
		}
		

		sb.append("\n\nCookies : \n");

		Cookie[] cookies = req.getCookies();
		for(Cookie cookie : cookies) {
			sb.append(cookie.getName() + "=" + cookie.getValue() + "\n");
		}
		
		writer.write(sb.toString());
		
		writer.write("</pre>");
		writer.write("</html>");

	}

}
