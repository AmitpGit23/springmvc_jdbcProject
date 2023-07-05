<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor=yellowgreen>
   <div align="center">
      <h1>Login Form</h1>
      <form method=Post action="signup">
       UserName : <input type=text name=username><br><br>
       Password : <input type=password name= password><br><br>
       <input type=submit><input type=reset>
       <br><br>
       New User. <a href="register">Register Here</a>
      </form>
      
      <h6 style="color:red">${lmsg }</h6>
     </div>


</body>
</html>