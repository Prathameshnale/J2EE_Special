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
<h2 align="center">Employee Leave Record table</h2>
<table align="center" border="2">
		<thead>
			<tr>
				<th>Leave_id</th>
				<th>Start Date</th>
				<th>End Date</th>
				<th>Leave Type</th>	
				<th>Leave Reason</th>	
				<th>Employee No</th>	
			</tr>
			
		</thead>
		<c:forEach var="e" items="${elist}">
		<tbody>
			<tr>
				<td>${e.leave_id}</td>
				<td>${e.start_date}</td>
				<td>${e.end_date}</td>
				<td>${e.leave_type}</td>
				<td>${e.leave_reason}</td>
				<td>${e.emp_no}</td>	
			</tr>
		</tbody>
		</c:forEach>
	</table><br>
	<div align="center"><button><a href="/Employee/XYZ_page">Back</a></button></div>
</body>
</html>