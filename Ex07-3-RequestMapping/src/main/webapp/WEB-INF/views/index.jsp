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

	<form action="/spring07/student" method="get">
		student id : <input type="text" name="id"> <br/>
		<input type= "submit" value="전송">
	</form>
	
	<hr>
		<form action="/spring07/student" method="post">
		student id : <input type="text" name="id"> <br/>
		<input type= "submit" value="전송">
	</form>
	
</body>
</html>
