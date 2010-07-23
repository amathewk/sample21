<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SCWCD Playground</title>
</head>
<body>
<a href="simpleServlet/simpleServlet.ri?a=b&c=d">/cookieVisiblePath/simpleServlet.ri?a=b&c=d</a>
<a href="simpleServlet?a=b&c=d">simpleServlet?a=b&c=d</a>

<%!
int b = 1;
public void jspInit() { System.out.println ("in init"); b+=4; }
public void jspDestroy() {System.out.println ("in destroy"); } 
%>
<%= b %>
<br/>
<br/>
<%= "Application scope attribute variable 'PRODUCTION' : " + application.getAttribute("PRODUCTION") + " <br/>"  %>
<%= "Application scope param 'PRODUCTION' : " + application.getInitParameter("PRODUCTION")  %>

<br/>
TRY SOME INCLUDE
<br/>
<%@ include file="/try.some" %>
</body>
</html>
