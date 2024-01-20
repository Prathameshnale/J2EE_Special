<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<form action="saveLeave" method="post">
	Empno<input type="number" name="emp_no" placeholder="Enter emp Id" required><br><br>
	Start Date<input type="date" name="start_date" placeholder="Enter start_date" required><br><br>
	End Date<input type="date" name="end_date" placeholder="Enter end_date" required><br><br>
	Leave Type<select name="leave_type">
			<option value="Earned_Leave">Earned Leave</option>
			<option value="Loos_of_Pay">Loss of Pay</option>
				</select><br><br>
	Leave Reason<select name="leave_reason">
			<option value="Personal">Personal</option>
			<option value="Sick">Sick</option>
			<option value="Ritual">Ritual</option>
			<option value="Out_of_Station">Out of Station</option>
				</select><br><br>
	<input type="submit" value="submit" placeholder="Enter emp Id"><br><br>
	</form>
</div>
</body>
</html>