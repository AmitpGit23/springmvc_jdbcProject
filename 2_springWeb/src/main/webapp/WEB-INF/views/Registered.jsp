<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="22e109">
<div align=center>
    <h1>${msg }</h1>

    <h3> Welcome , ${employee.name}</h3>
    <h3>Your address id is  ${employee.address}</h3>
    <h3>your city is ${employee.city }</h3>   
    
    <a href="login">login</a> 
</div>





</body>
</html>