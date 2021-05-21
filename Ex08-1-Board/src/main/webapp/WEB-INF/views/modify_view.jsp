<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>


<%
	String conPath = request.getContextPath();
%>
</head>
<body>
	<table width= "500" cellpadding= "0" cellspacing= "0" border= "1">
		<form action="<%=conPath%>/modify" method= "post">
		<input type= "text" name= "bId" value= "${content_view.bId}">
			<tr>
				<td>번호</td>
				<td>${content_view.bId}</td>
			</tr>
			<tr>
				<td>히트</td>
				<td>${content_view.bHit}</td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type= "text" name="bName" value= "${content_view.bName}"></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type= "text" name="bTitle" value= "${content_view.bTitle}"></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><input rows= "10" name="bContent" value= "${content_view.bContent}"></td>
			</tr>
			<tr>
				<td colspan= "2"> <input type= "submit" value= "수정">&nbsp;&nbsp;
					<a href= "<%=conPath%>/list">목록보기</a>&nbsp;&nbsp;
					<a href= "<%=conPath%>/content_view?bId=${content_view.bId}">취소</a>&nbsp;&nbsp;
				</td>
			</tr>
		</form>
	</table>
</body>
</html>