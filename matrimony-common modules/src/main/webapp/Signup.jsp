<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="mystylesheet.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<header style="background-color: #fffef22b;">
	<h1 label for="user__title">Kannada matrimony</h1>
	<button
		style="position: absolute; top: 0; right: 0; background-color: #00000029; font-weight: bolder"><a href="login.jsp">LogIn</a></button>
</header>
<script type="text/javascript">
	function validate() {
		var name = document.myform.candidateName.value;
		var emailId = document.myform.candidateEmailId.value;
		var phNo = document.myform.candidatePhoneNo.value;
		var Dob = document.myform.candidateDob.value;
		var gender = document.myform.candidateGender.value;
		var password = document.myform.candidatePassword.value;
		var cPassword = document.myform.candidateConfirmPassword.value;
		var format = /^[!@#$%^&*()_+\-=\[\]{};':"\\|,.<>\/?]*$/;
		var phoneNum = /^\(?([0-9]{3})\)?[-. ]?([0-9]{3})[-. ]?([0-9]{4})$/;
		var check = function() {
			if (document.getElementById('candidatePassword').value == document
					.getElementById('candidateConfirmPassword').value) {
				document.getElementById('message').style.color = 'green';
				document.getElementById('message').innerHTML = 'matching';
			} else {
				document.getElementById('message').style.color = 'red';
				document.getElementById('message').innerHTML = 'not matching';
			}
		}
		if (name.match(format)) {
			alert("Name can't be special character ");
			return false;
		}
		if (name == null || name == "" || name.length<3||name.length>18) {
			alert("Name can't be blank or >3 or <18 or null ");
			return false;
		} else if (emailId == "" || emailId == null || emailId.length > 59) {
			alert("email id can't be null or empty or length <59");
			return false;
		} else if (phNo.length != 10 || !phNo.match(phoneNum)) {
			alert("Phone No length should be 10 or should be numbers only");
			return false;
		}
		var decimal = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9])(?!.*\s).{8,15}$/;
		if (password.match(decimal)) {
			if (cPassword == password) {

			} else {
				alert("password doesn't match")
				return false;
			}

		} else {
			alert('Password must 1 special character &1 upper case &1 lower case ')
			return false;
		}

	}
</script>
</head>
<body>
	<div></div>
	<div>
		<h2> Register Here</h2>
		<form action="signup.do" name="myform" onsubmit="return validate()"
			style="font-weight: bold">
			<table style="    text-align: initial;margin-left: auto;margin-right: auto;">
				<tr>
					<td>Candidate Name:</td>
					<td><input type="text" name="candidateName"></td>
				</tr>

				<tr>
					<td><labelfor="email">Candidate Email Id:</label></td>
					<td><input type="email" name="candidateEmailId"></td>
				</tr>
				<tr>
					<td>Candidate Contact No:</td>
					<td><input type="text" name="candidatePhoneNo"></td>
				</tr>
				<tr>
					<td><label for="DOB">Candidate DOB:</label></td>
					<td><input type="date" name="candidateDob"></td>
				</tr>
				<tr>
					<td><label style="text-align: left; position:">
							Candidate Gender:</label></td>
					<td><input type="radio" id="male" name="candidateGender" value="male"> 
					<label for="male">Male</label> 
					<input type="radio" id="female" name="candidateGender" value="female">
						<label for="female">Female</label> <input type="radio" id="other"
						name="candidateGender" value="other"> <label for="other">Other</label></td>
				</tr>

				<tr>
					<td>Candidate Password:</td>
					<td><input type="password" name="candidatePassword"
						onkeyup='check();'></td>
				</tr>
				<tr>
					<td>Confirm Password:</td>
					<td><input type="password" name="candidateConfirmPassword"
						onkeyup='check();'> <span id='message'></span></td>
				</tr>
			</table>
			<button type="reset" value="Cancel">Cancel</button>
			<button type="submit" value="Save">Save</button>

		</form>
	</div>
</body>
<footer
	style="margin: bottom; position: absolute; bottom: 0; width: 100%; height: 60px;background-color: #fffef22b;">
	ContactUs @since 2021 copyright</footer>
</html>