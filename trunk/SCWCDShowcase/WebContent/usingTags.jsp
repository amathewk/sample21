<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


C:OUT TAG

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%><br/>
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



