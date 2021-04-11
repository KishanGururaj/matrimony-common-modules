<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="mystylesheet.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<header style="background-color: #fffef22b;">
	<h1 label for="user__title">Kannada Matrimony</h1>
	<button
		style="position: absolute; top: 0; right: 0; background-color: #00000029; font-weight: bolder">Log
		out</button>
</header>
<form action="details.do">
<table style="margin-left: auto;margin-right: auto">
<tr>
<td>Candidate Full Name:</td>
<td><input type="text" name="candidateFullName"></td></tr>
<tr><td>Candidate Caste:</td>
<td><input type="text" name="candidateCaste"></td></tr>
<tr><td>Candidate Salary :</td>
<td><input type="text" name="candidateSalary"></td></tr>
<tr><td> Candidate Desire:</td>
<td><input type="text" name="candidateDesire"></td></tr>
<tr><td> Candidate gender:</td>
<td><input type="text" name="candidateGender"></td></tr>
</table>
<input type="submit" name="Apply Details">

</form>
</body>
<footer style="margin: bottom; position: absolute; bottom: 0; width: 100%; height: 60px;background-color: #fffef22b;">

	ContactUs @since 2021 copyright</footer>
</html>