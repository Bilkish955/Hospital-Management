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
<u><i>Single Patient </i></u>
</h1>
<br/>
<h3>
<table border="2">
<tr>
 <td>Patient ID:</td>
 <td>${patientRecord.patientId}</td></tr>
 <tr>
 <td>Patient Name:</td>
 <td>${patientRecord.patientName}</td>
 </tr>
 <tr>
 <td>Address:</td>
 <td>${patientRecord.patientAddress}</td>
 </tr>
 <tr>
 <td>Contact No:</td>
 <td>${patientRecord.contactNo}</td>
 </tr>
<tr>
  <td>Gender:</td>
  <td>${patientRecord.gender}</td>
  </tr>
  <tr>
  <td>Ward ID:</td>
  <td>${patientRecord.wardId}</td>
  </tr>
  <tr>
  <td>Admission Date:</td>
  <td>${patientRecord.admissionDate}</td>
  </tr>
  <tr>
  <td>Release Date:</td>
  <td>${patientRecord.releaseDate}</td>
  </tr>
  <tr>
  <td>Doctor ID:</td>
  <td>${patientRecord.doctorId}</td>
  </tr>
  <tr>
  <td>Medical Exp:</td>
  <td>${patientRecord.medicalExp}</td>
  </tr>
  <tr>
  <td>Doctor Visits:</td>
  <td>${patientRecord.doctorVisits}</td>
  </tr>
  <tr>
  <td>Doctor Fees:</td>
  <td>${patientRecord.doctorFees}</td>
  </tr>
  <tr>
  <td>Case:</td>
  <td>${patientRecord.caseDescription}</td>
  </tr>
</table> 
</h3>
<h4>
<a href="/">Return</a>
</h4>
</div>
</body>
</html>