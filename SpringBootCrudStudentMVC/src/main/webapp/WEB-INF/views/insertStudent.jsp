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
	<form action="newStudent" method="post">
		Enter Sid:<input type="number" name="sid" placeholder="Enter Id" required><br><br>
		Enter Name:<input type="text" name="sname" placeholder="Enter Name" required><br><br>
		Enter marks:<input type="text" name="marks" placeholder="Enter marks" required><br><br>
		<input type="submit" name="eid" value="submit"><br><br>	
	</form>
</div>
</body>
</html>