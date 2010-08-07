<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


C:OUT TAG

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%><br/>
<br/>
<br/>
<br/>
WITHOUT ESCAPE:
<c:out value="<a>b<c>" escapeXml="false" ></c:out>
<br/>
WITH TAGS:
<c:out value="<a>b<c>" escapeXml="true" ></c:out>

<br/>
<br/>

null value: <c:out value="${something}"></c:out>
<br/>
<c:set var="something" value="null" ></c:set>
<br/>
now defined: <c:out value="${something}"></c:out>
<br/>
<c:set var="something"></c:set>
<br/>
now undefined again: <c:out value="${something}"></c:out>

<br/>
<br/>
<c:out value="${something2}" default="DEFAULT OUTPUT"></c:out>
<br/>
<c:out value="${something}">DEFAULTOUTPUT</c:out>

<% List cars = new ArrayList();
	cars.add("Nissan");
	cars.add("Toyota");
	cars.add("Ford");
	pageContext.setAttribute("cars", cars);
%>
<c:forEach var="car" items="${cars}"  begin="1" end="2" varStatus="st" > <c:out value="${st.index}:${car}" ></c:out>  </c:forEach>

<br/>
<c:set var="car" value="infiniti"/>
<c:if test="${car == 'infiniti'}">
	INFINITI
</c:if>

<%
	Map carMap = new HashMap();
	carMap.put("honda","4");
	pageContext.setAttribute("carMap", carMap);
%>
<br/>
<c:set property="honda" value="3" target="${carMap}" ></c:set>
<c:out value="${carMap.honda}"/>

<br/>
<c:set var="a" value="AA" scope="session" />
<c:set var="a" value="DD" scope="request" />
<c:out value="${a}"  />

<br/>
REMOVE FROM SESSION
<br/>
<c:remove var="a" scope="session"/>
AFTER : <c:out value="${a}"  />
<br/>
<br/>
REMOVE FROM ALL SCOPES
<br/>
<c:remove var="a" />
AFTER : <c:out value="${a}"  />
<br/>

<c:import url="included.jsp" >
	<c:param name="incVal" value="cat"></c:param>
	<c:param name="incVal2">cat2</c:param>
</c:import>

<pre>
==============================
==============================
==============================
</pre>
<c:import url="http://www.google.com" var="google"></c:import>
<c:out value="${google}" escapeXml="false" />


