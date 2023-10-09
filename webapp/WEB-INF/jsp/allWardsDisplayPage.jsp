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
<h1 style="color:orange">
<u><i>All Wards </i></u>
</h1>
<br/>
<h2>
<table border="2">
<tr>
    			<th>Ward ID</th>
    			<th>Ward Name</th>
    			<th>Beds</th>
    			<th>Available</th>
    			<th>Fare/Day</th>
    			
   			 </tr>
   			 
   			 <c:forEach  items="${wardRecords}" var="ward">
      		<tr>
      			<td>${ward.wardId}</td>
      			<td>${ward.wardName}</td>
      			<td>${ward.beds}</td>
      			<td>${ward.available}</td>
      			<td>${ward.farePerDay}</td>
      			
    		</tr>  
    		</c:forEach>
   		</table>
   		<br/><br/>
   		<a href="/">Return</a>
 	</h2>
	

</div>

</body>
</html>