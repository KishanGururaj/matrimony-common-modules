<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="mystylesheet.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-image: url('matrimony -2.jpg');background-repeat: no-repeat;background-size: cover;">
<header style="background-color: #fffef22b;">
	<h1 label for="user__title">Kannada matrimony</h1>
	<button
		style="position: absolute; top: 0; right: 0; background-color: #00000029; font-weight: bolder">Log
		out</button>
</header>
<h1>Update Candidate Details</h1>
<form action="update.do">
Candidate Email:<input type="text"  name="candidateEmailId" value="${entity.getCandidateEmailId()}"><br>
Candidate name:<input type="text" name="candidateName" placeholder="${entity.getCandidateName()}"><br>
Candidate gender:<input type="text" name="candidateGender" placeholder="${entity.getCandidateGender()}"><br>
Candidate Dob:<input type="text" name="candidateDob" placeholder="${entity.getCandidateDob()}"><br>
Candidate Phone No:<input type="text"  name="candidatePhoneNo" placeholder="${entity.getCandidatePhoneNo()}"><br>
<input type="submit" value="update">
</form>
</body>
<footer style="margin: bottom; position: absolute; bottom: 0; width: 100%; height: 60px;background-color: #fffef22b;">

	ContactUs @since 2021 copyright</footer>
</html>