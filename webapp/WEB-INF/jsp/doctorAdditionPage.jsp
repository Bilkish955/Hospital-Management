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
<form:form action="/doctor-save" method="post" modelAttribute="doctorRecord">
<h2>
<form:input type="hidden" path="doctorId"/>
Doctor ID:<form:input type="text" path="doctorId" disabled="true"/>
<br/><br/>
Doctor Name:<form:input type="text" path="doctorName"/>
<br/><br/>
Specialization:<form:input type="text" path="specialization"/>
<br/><br/>
Fee:<form:input type="text" path="fee"/>
<br/><br/>
Patients:<form:input type="text" path="patients" value="0" readonly="readOnly"/>
<br/><br/>
</h2>
<button type="submit">Submit</button>
</form:form>
</div>
</body>
</html>