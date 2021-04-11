<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="mystylesheet.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<header style="background-color: #fffef22b;">
	<h1 label for="user__title">Kannada matrimony</h1>
	<button
		style="position: absolute; top: 0; right: 0; background-color: #00000029; font-weight: bolder">Log
		out</button>
</header>
${msg }<br>
<a href="details.jsp">Try again </a>if unsuceessfull
<form action="getbygender.do">
Candidate Gender:<input type="text" placeholder="male/female/others" name="gender">
<input type="submit" value="search">
</form>
<table style="margin-left: auto;margin-right: auto">
<tr>
<th> Candidate Full Name </th>
<th> Candidate Gender </th>
<th> Candidate Caste </th>
<th> Candidate Salary </th>
<th> Candidate Desire </th>
</tr>
<c:forEach var="entity" items="${detailsList}">
<tr>
<td>${entity.getCandidateFullName()}</td>
<td>${entity.getCandidateGender()}</td>
<td>${entity.getCandidateCaste()}</td>
<td>${entity.getCandidateSalary()}</td>
<td>${entity.getCandidateDesire()}</td>
</tr>
</c:forEach>
</table>
</body>
<footer style="margin: bottom; position: absolute; bottom: 0; width: 100%; height: 60px;background-color: #fffef22b;">
	ContactUs @since 2021 copyright</footer>
</html>