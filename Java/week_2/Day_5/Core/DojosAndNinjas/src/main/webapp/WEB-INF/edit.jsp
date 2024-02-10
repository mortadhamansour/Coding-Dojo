<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Demo JSP</title>
</head>
<body>

	<h1>Update a Ninja</h1>
	<!-- 		Update a Book Form -->
	<form:form action="/ninjas/${ninja.id }" method="post"
		modelAttribute="ninja">
		<input type="hidden" name="_method" value="put">
		<form:errors path="*" />
		<p>
			<form:label path="firstName">First Name</form:label>

			<form:input path="firstName" />
		</p>
		<p>
			<form:label path="lastName">Last Name</form:label>

			<form:input path="lastName" />
		</p>

		<p>
			<form:label path="age">Age</form:label>

			<form:input type="number" path="age" />
		</p>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>