<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<table border="2">
		<thead>
			<tr>
				<th>Student ID</th>
				<th>Student Name</th>
				<th>Student marks</th>
				<th>Student Action</th>
			</tr>
		</thead>
		<c:forEach var="s" items="${slist}">
			<tbody>
			<tr>
				<td>${s.sid}</td>
				<td>${s.sname}</td>
				<td>${s.marks}</td>
				<td><a href="delete/${s.sid}">Delete</a> | <a href="edit/${s.sid}">Edit</a></td>
			</tr>
			</tbody>
		</c:forEach>
	</table>
	<a href="addNewStudent">Add New</a>
</div>
</body>
</html>