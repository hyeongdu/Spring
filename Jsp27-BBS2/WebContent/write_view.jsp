<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://cdn.ckeditor.com/4.16.0/standard/ckeditor.js"></script>
</head>
<body>
	<table width="1000" cellpadding="0" cellspacing="0" border= "1">
		<form action="write.do" method= "post">
			<tr>
				<td>이름</td>
				<td><input type= "text"	name= "bName" size= "50"></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type= "text"	name= "bTitle" size= "50"></td>
			</tr>
			<tr>
				<td>내용</td>
				<td>
				<<textarea name= "bContent" id="editor1" rows= "10">
				</textarea>
				 <script>
                        CKEDITOR.replace( 'editor1' );
                </script>
				</td>
			</tr>
			<tr>
				<td colspan= "2">
					<input type="submit" value= "입력"> &nbsp;&nbsp;
					<a href="list.do">목록보기</a>
				</td>
			</tr>
		</form>
	</table>
	인생은 즐거워
</body>
</html>