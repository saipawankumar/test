<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<html>
<body>

	<form action="addUser" method="GET">
		Username: <input type="text" name="username"> <br /> 
		City: <input type="text" name="city" /> <br/>
		<input type="submit" value="Add user" /> <br/>
	</form>


	<table>

		<c:forEach items="${userlist}" var="user">
			<tr>
				<td>${user.username}</td>
				<td>${user.city}</td>
			</tr>
		</c:forEach>


	</table>



</body>
</html>
