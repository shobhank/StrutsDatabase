<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Login</title>
</head>
<body>
   <form action="login_action" method="post">
      User:<br/><input type="text" name="username"/><br/>
      Password:<br/><input type="password" name="userpwd"/><br/>
      <input type="submit" value="Login"/>		
   </form>
</body>
</html>