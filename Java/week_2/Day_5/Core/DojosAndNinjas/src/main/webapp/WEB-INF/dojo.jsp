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

		<!-- 		Display all dojos -->
		<table class="table">
			<thead>
				<tr>

					<th>Name</th>

				</tr>
			</thead>
			<tbody>
				<c:forEach items="${dojos }" var="oneDojo">
					<tr>

						<td><a href="/dojos/${oneDojo.id }"> ${oneDojo.name} </a></td>

					</tr>
				</c:forEach>
			</tbody>
		</table>
		<hr>

		<!-- 		Create a Book Form -->
		<form:form action="/dojos/processDojo" method="post"
			modelAttribute="dojo">
			<form:errors path="*" />
			<p>
				<form:label path="name">Name</form:label>

				<form:input path="name" />
			</p>


			<button>Submit</button>
		</form:form>
	</div>
</body>
</html>