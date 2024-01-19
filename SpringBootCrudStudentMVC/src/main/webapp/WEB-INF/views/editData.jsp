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
	<form action="/Student/updateStudent" method="post">
		Enter Sid:<input type="number" name="sid" placeholder="Enter Id" value="${s.sid}"  readonly><br><br>
		Enter Name:<input type="text" name="sname" placeholder="Enter Name" value="${s.sname}" required><br><br>
		Enter marks:<input type="text" name="marks" placeholder="Enter marks" value="${s.marks}" required><br><br>
		<input type="submit" name="eid" value="submit"><br><br>	
	</form>
</div>
</body>
</html>