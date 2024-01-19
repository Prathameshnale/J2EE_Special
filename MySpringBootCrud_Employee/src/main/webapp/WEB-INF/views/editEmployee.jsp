<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/Employee/updateEmployee" method="post">
	Enter Eid:<input type="number" name="eid" placeholder="Enter Id" value="${e.eid}" required readonly><br><br>
		Enter Name:<input type="text" name="ename" placeholder="Enter Name" value="${e.ename}" required><br><br>
		Enter Email:<input type="text" name="email" placeholder="Enter Email" value="${e.email}" required><br><br>
		<input type="submit" name="eid" value="submit"><br><br>	
</form>
</body>
</html>