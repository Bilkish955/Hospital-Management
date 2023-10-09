<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1 style="color:green">
<u><i>All Doctors </i></u>
</h1>
<br/>
<h2>
<table border="2">
<tr>
    			<th>Doctor ID</th>
    			<th>Doctor Name</th>
    			<th>Specialization</th>
    			<th>Fee</th>
    			<th>Patients</th>
    			
   			 </tr>
   			 
   			 <c:forEach  items="${doctorRecords}" var="doctor">
      		<tr>
      			<td>${doctor.doctorId}</td>
      			<td>${doctor.doctorName}</td>
      			<td>${doctor.specialization}</td>
      			<td>${doctor.fee}</td>
      			<td>${doctor.patients}</td>
      			
    		</tr>  
    		</c:forEach>
   		</table>
   		<br/><br/>
   		<a href="/">Return</a>
 	</h2>
	

</div>
</body>
</html>