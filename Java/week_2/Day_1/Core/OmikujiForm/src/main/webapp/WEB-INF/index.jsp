<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Omikuji</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
</head>
<body>
		<h1>Send an Omikuji!</h1>
	<form action="/message" method="GET" class="container">
		<div>
			<label>Pick any number from 5 to 25:</label> <input type="number" name="number">
		</div>
		<div>
			<label>Enter the name of any city:</label> <input type="text" name="city">
		</div>
		<div>
			<label>Enter the name of any real person:</label> <input type="text" name="person">
		</div>
		<div>
			<label>Enter professional endeavor or hobby:</label> <input type="text" name="hobby">
		</div>
		<div>
			<label>Enter any type of living thing:</label> <input type="text" name="thing">
		</div>
		<div>
			<label>Say something nice to someone:</label>
			<textarea rows="" cols="" name="descreption"></textarea>
		</div>
		<div>
			<input type="submit">
		</div>
	</form>
</body>
</html>