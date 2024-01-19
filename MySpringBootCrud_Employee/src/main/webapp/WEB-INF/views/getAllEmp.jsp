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
	<table align="center" border="2">
		<thead>
			<tr>
				<th>Employee Id</th>
				<th>Employee Name</th>
				<th>Employee Email</th>
				<th>Employee Actions</th>	
			</tr>
		</thead>
		<c:forEach var="e" items="${elist}">
		<tbody>
			<tr>
				<td>${e.eid}</td>
				<td>${e.ename}</td>
				<td>${e.email}</td>
				<td><a href="delete/${e.eid}">Delete</a> | <a href="edit/${e.eid}">Edit</a></td>	
			</tr>
		</tbody>
		</c:forEach>
	</table><br>
	<a href="addNewEmp">Add New Employee</a>
</div>
</body>
</html>