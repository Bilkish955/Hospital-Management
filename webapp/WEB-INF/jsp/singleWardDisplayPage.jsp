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
<u><i>Single Ward </i></u>
</h1>
<br/>
<h3>
<table border="2">
<tr>
 <td>Ward ID:</td>
 <td>${wardRecord.wardId}</td></tr>
 <tr>
 <td>Ward Name:</td>
 <td>${wardRecord.wardName}</td>
 </tr>
 <tr>
 <td>Beds:</td>
 <td>${wardRecord.beds}</td>
 </tr>
 <tr>
 <td>Available:</td>
 <td>${wardRecord.available}</td>
 </tr>
<tr>
  <td>Fare/Day:</td>
  <td>${wardRecord.farePerDay}</td>
  </tr>
</table> 
</h3>
<h4>
<a href="/">Return</a>
</h4>
</div>
</body>
</html>