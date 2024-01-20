<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Leave Details </title>
</head>
<body>
	
	<center><h1>Leave History</h1></center>
	<hr>
<table border="2" align="center">
  <tr >
     <th>leave Id</th>
     <th>leave Applied On</th>
     <th>Start Date</th>
     <th>End Date</th>
     <th>leave Type</th>
     <th>leave Reason</th>
     <th>Employee No</th>
  </tr>
  <c:forEach var="d" items="${dlist}">
     <tr>
       <td>${d.leave_id}</td>
       <td>${d.leave_applied_on}</td>
       <td>${d.start_date}</td>
       <td>${d.end_date}</td>
       <td>${d.leave_type}</td>
       <td>${d.leave_reason}</td>
        <td>${d.empno}</td>
     </tr>
  </c:forEach>
</table>
</body>
</html>