<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmed</title>
</head>
<body>
	Hello  ${student.firstName }  ${student.lastName } from ${student.country}
	<br>
	Favorite Language: ${student.favoriteLanguage}
	<br>
	Subjects :
	<br>
	<ul>
		<c:forEach var="temp" items="${student.subject }">
			<li>${temp } </li>
		</c:forEach>
	</ul>
	Your registration has been confirmed.
	<br>
	<br> 
	Thank you
</body>
</html>