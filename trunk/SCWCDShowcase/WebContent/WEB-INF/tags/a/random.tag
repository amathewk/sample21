<%@ tag language="java" pageEncoding="UTF-8"  body-content="tagdependent" %>

<%@ tag import="java.util.Random"%>

<%@ attribute name="max" required="true" rtexprvalue="true" type="java.lang.Integer" %>



<p>
using scriptlet
<%
int max = (Integer)jspContext.findAttribute("max");
%>
<%= new Random().nextInt(max) %>
</p>

<jsp:doBody></jsp:doBody>

