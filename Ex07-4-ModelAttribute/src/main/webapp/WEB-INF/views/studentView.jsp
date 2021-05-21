<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>StudentView</title>
</head>


<body>
<h1>
	name : ${sInfo.name}  <br/>
	age : ${sInfo.age}  <br/>
	grade : ${sInfo.gradeNum}  <br/>
	class : ${sInfo.classNum}  <br/>
	
</h1>

</body>
</html>
