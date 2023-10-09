<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<form:form action="/patient-save" method="post" modelAttribute="patientRecord">
<h2>
Patient ID: <form:input type="text" path="patientId" readonly="readOnly"/>
<br/><br/>
Patient Name: <form:input type="text" path="patientName"/>
<br/><br/>
Address: <form:input type="text" path="patientAddress"/>
<br/><br/>
Contact No: <form:input type="text" path="contactNo"/>
<br/><br/>
Gender: <input type="text" list="genderOptions" name="gender"/>
<datalist id="genderOptions">
  <option value="Male">Male</option>
  <option value="Female">Female</option>
  <option value="Other">Other</option>
</datalist>
<br/><br/>
Ward ID: <input type="text" list="wardOptions" name="wardId"/>
<datalist id="wardOptions">
  <option value="W101">W101</option>
  <option value="W102">W102</option>
  <option value="W103">W103</option>
  <option value="W104">W104</option>
</datalist>
<br/><br/>
Admission Date: <input type="date"/>
<br/><br/>
Release Date: <input type="date"/>
<br/><br/>
Doctor ID: <input type="text" list="doctorOptions" name="doctorId">
<datalist id="doctorOptions">
  <option value="D1001">D1001</option>
  <option value="D1002">D1002</option>
  <option value="D1003">D1003</option>
  <option value="D1004">D1004</option>
</datalist>
<br/><br/>
Medical Exp:<form:input type="text" path="medicalExp"/>
<br/><br/>
Doctor Visits:<form:input type="text" path="doctorVisits"/>
<br/><br/>
Doctor Fees:<form:input type="text" path="doctorFees"/>
<br/><br/>
Case:<input type="text" list="caseOptions" name="caseDescription">
<datalist id="caseOptions">
  <option value="Heart">Heart</option>
  <option value="Maternity">Maternity</option>
  <option value="Ear Problem">Ear Problem</option>
</datalist>
<br/><br/>
</h2>
<button type="submit">Update</button>
<button type="reset">Reset</button>
</form:form>
</div>
</body>
</html>