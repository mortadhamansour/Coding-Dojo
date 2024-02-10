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
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css" />
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

</head>
<body>
	<div class="container">
		<h1>Save Travels</h1>
		<!-- 		Display all travels -->
		${allBooks  }
		<table class="table">
			<thead>
				<tr>

					<th>Expense</th>
					<th>Vendor</th>
					<th>Amount</th>
					<th>actions</th>

				</tr>
			</thead>
			<tbody>
				<c:forEach items="${allTravels }" var="oneTravel">
					<tr>

						<td>${oneTravel.expense}</td>
						<td>${oneTravel.vendor}</td>
						<td>${oneTravel.amount}</td>
						<td><a href="/expenses/edit/${oneTravel.id }">Edit</a>
							<form action="/expenses/${oneTravel.id}" method="post">
								<input type="hidden" name="_method" value="delete"> <input
									type="submit" value="Delete">
							</form></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<hr>
		<!-- 		Create a travel Form -->
		<form:form action="/expenses/processTravel" method="post"
			modelAttribute="travel">
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
	</div>
</body>
</html>