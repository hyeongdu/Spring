<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Index</title>
</head>

<body>
<h1>
	Hello world!  
</h1>
<%
	String context = request.getContextPath();
%>

	<form action="/spring08/studentView" method="post">
		student name : <input type="text" name="name"> <br/>
		student age : <input type="text" name="age"> <br/>
		student grade : <input type="text" name="gradeNum"> <br/>
		student class : <input type="text" name="classNum"> <br/>
		
		<input type= "submit" value="전송">
	</form>
	
	<hr>
	
	
</body>
</html>
