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
<u><i>All Patients </i></u>
</h1>
<br/>
<h2>
<table border="2">
<tr>
    			<th>Patient ID</th>
    			<th>Patient Name</th>
    			<th>Address</th>
    			<th>Contact No</th>
    			<th>Gender</th>
    			<th>Ward ID</th>
    			<th>Admission Date</th>
    			<th>Release Date</th>
    			<th>Doctor ID</th>
    			<th>Medical Exp</th>
    			<th>Doctor Visits</th>
    			<th>Doctor Fees</th>
    			<th>Case</th>
    			
   			 </tr>
   			 
   			 <c:forEach  items="${patientRecords}" var="patient">
      		<tr>
      			<td>${patient.patientId}</td>
      			<td>${patient.patientName}</td>
      			<td>${patient.patientAddress}</td>
      			<td>${patient.contactNo}</td>
      			<td>${patient.gender}</td>
      			<td>${patient.wardId}</td>
      			<td>${patient.admissionDate}</td>
      			<td>${patient.releaseDate}</td>
      			<td>${patient.doctorId}</td>
      			<td>${patient.medicalExp}</td>
      			<td>${patient.doctorVisits}</td>
      			<td>${patient.doctorFees}</td>
      			<td>${patient.caseDescription}</td>
      			
      			
    		</tr>  
    		</c:forEach>
   		</table>
   		<br/><br/>
   		<a href="/">Return</a>
 	</h2>
	

</div>
</body>
</html>