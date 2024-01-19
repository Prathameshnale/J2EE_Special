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
	<form action="addNewEmployee" method="post">
		Enter Eid:<input type="number" name="eid" placeholder="Enter Id" required><br><br>
		Enter Name:<input type="text" name="ename" placeholder="Enter Name" required><br><br>
		Enter Email:<input type="text" name="email" placeholder="Enter Email" required><br><br>
		<input type="submit" name="eid" value="submit"><br><br>	
	</form>
</div>
</body>
</html>