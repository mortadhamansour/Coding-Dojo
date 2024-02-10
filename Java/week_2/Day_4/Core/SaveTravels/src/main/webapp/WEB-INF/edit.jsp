<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Demo JSP</title>
</head>
<body>

	<h1>Edit Expense</h1>
	<!-- 		Update a Book Form -->
	<form:form action="/expenses/${travel.id }" method="post"
		modelAttribute="travel">
		<input type="hidden" name="_method" value="put">
		<form:errors path="*" />
		<p>
			<form:label path="expense">Expense</form:label>

			<form:input path="expense" />
		</p>
		<p>
			<form:label path="vendor">Vendor</form:label>

			<form:input path="vendor" />
		</p>

		<p>
			<form:label path="amount">Amount</form:label>

			<form:input type="number" path="amount" />
		</p>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>