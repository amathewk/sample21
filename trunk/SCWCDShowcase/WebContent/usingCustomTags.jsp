<%@ taglib prefix="my" uri="myTagLib" %>
<%@ taglib prefix="mine" tagdir="/WEB-INF/tags/a" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

${my:add(3,4)}

<c:set var="max" value="10"/>
<mine:random max="<%= (String)pageContext.findAttribute("max") %>" >
	is a random number less than ${max}
</mine:random>