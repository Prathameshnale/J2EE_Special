<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Leave Form </title>
</head>
<body>
	<center><h2> Apply Leave Page </h2></center>
	<br>
	<hr>

	<form action="insertdetails" method="post">
	Enter Employee Id:<input type="number" name="empno" placeholder="Enter Empno"><br><br>
	Enter Applied On  Date:<input type="date" name="leave_applied_on;" placeholder="Enter Applied On"><br><br>
	Enter Start Date:<input type="date" name="start_date" placeholder="Enter Start Date"><br><br>
	Enter End Date:<input type="date" name="end_date" placeholder="Enter End Date"><br><br>
	
	Leave Type : <select name="leave_type" >
				<option>select<option>
				<option>Earned Leave<option>
				<option>Loss Of Pay<option>
				 </select><br><br>
				 
	Leave Reason : <select name="leave_reason">
				<option>select<option>
				<option>Personal<option>
				<option>Sick<option>
				<option>Ritual<option>
				<option>Out Of Station<option>
				 </select><br><br>
	
	<input type="submit" value="Apply Leave" id="button" placeholder="Apply Leave">
	</form>

</body>
</html>