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
<u><i>Single Doctor </i></u>
</h1>
<br/>
<h3>
<table border="2">
<tr>
 <td>Doctor ID:</td>
 <td>${doctorRecord.doctorId}</td></tr>
 <tr>
 <td>Doctor Name:</td>
 <td>${doctorRecord.doctorName}</td>
 </tr>
 <tr>
 <td>Specialization:</td>
 <td>${doctorRecord.specialization}</td>
 </tr>
 <tr>
 <td>Fee:</td>
 <td>${doctorRecord.fee}</td>
 </tr>
<tr>
  <td>Patients:</td>
  <td>${doctorRecord.patients}</td>
  </tr>
</table> 
</h3>
<h4>
<a href="/">Return</a>
</h4>
</div>
</body>
</html>