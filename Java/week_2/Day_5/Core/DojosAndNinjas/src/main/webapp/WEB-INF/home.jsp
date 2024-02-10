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
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css" />
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

</head>
<body>
	<div class="container">

		<!-- 		Display all Books -->

		<table class="table">
			<thead>
				<tr>

					<th>First name</th>
					<th>Last Name</th>
					<th>Age</th>

				</tr>
			</thead>
			<tbody>
				<c:forEach items="${allNinjas }" var="oneNinja">
					<tr>

						<td>${oneNinja.firstName}</td>
						<td>${oneNinja.lastName}</td>
						<td>${oneNinja.dojo.name}</td>
						<td><a href="/ninjas/edit/${oneNinja.id }">Edit</a>
							<form action="/books/${oneNinja.id}" method="post">
								<input type="hidden" name="_method" value="delete"> <input
									type="submit" value="Delete">
							</form></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<hr>
		<!-- 		Create a Book Form -->
		<form:form action="/ninjas/processNinja" method="post"
			modelAttribute="ninja">
			<form:errors path="*" />
			<p>
				<form:label path="firstName">First Name</form:label>

				<form:input path="firstName" />
			</p>
			<p>
				<form:label path="lastName">last Name</form:label>

				<form:input path="lastName" />
			</p>

			<p>
				<form:label path="age">Age</form:label>

				<form:input type="number" path="age" />
			</p>

			<p>
				<form:label path="dojo">Dojo</form:label>

				<form:select path="dojo">
					<c:forEach items="${dojos }" var="oneDojo">
						<option value="${oneDojo.id }">${oneDojo.name }</option>
					</c:forEach>
				</form:select>
			</p>
			<input type="submit" value="Submit" />
		</form:form>
	</div>
</body>
</html>