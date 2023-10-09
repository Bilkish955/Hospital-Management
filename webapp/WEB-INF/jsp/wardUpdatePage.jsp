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
<form:form action="/ward-save" method="post" modelAttribute="wardRecord">
<h2>
Ward ID:<form:input type="text" path="wardId" readonly="readOnly"/>
<br/><br/>
Ward Name:<form:input type="text" path="wardName"/>
<br/><br/>
Beds:<form:input type="text" path="beds"/>
<br/><br/>
Available:<form:input type="text" path="available"/>
<br/><br/>
Fare/Day:<form:input type="text" path="farePerDay"/>
<br/><br/>
</h2>
<button type="submit">Update</button>
<button type="reset">Reset</button>
</form:form>
</div>
</body>
</html>