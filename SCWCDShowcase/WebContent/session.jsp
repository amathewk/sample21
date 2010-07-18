<%@ page import="java.util.Enumeration" %>

<%
	out.println("SESSION VARIABLES<br/>");
	Enumeration names = session.getAttributeNames();
	while(names.hasMoreElements())
	{
		String name = (String)names.nextElement();
		Object value = session.getAttribute(name);
		out.println(name + " = " + value);
	}

%>