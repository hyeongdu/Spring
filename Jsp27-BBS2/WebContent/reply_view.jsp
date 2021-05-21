<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<!-- include libraries(jQuery, bootstrap) -->
<link href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<!-- include summernote css/js -->
<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.js"></script>


</head>
<body>
	<table width="500" cellpadding="0" cellspacing="0" border= "1">
		<form action="reply.do" method= "post">
		<input type="hidden" name="bId" value="${reply_view.bId}">
		<input type="hidden" name="bGroup" value="${reply_view.bGroup}">
		<input type="hidden" name="bStep" value="${reply_view.bStep}">
		<input type="hidden" name="bIndent" value="${reply_view.bIndent}">
		
			<tr>
				<td>번호</td>
				<td>${reply_view.bId}</td>
			</tr>
			<tr>
				<td>히트</td>
				<td>${reply_view.bHit}</td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type= "text"	name= "bName" value="${reply_view.bName}"></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type= "text"	name= "bTitle" value="${reply_view.bTitle}"></td>
			</tr>
			<tr>
				<td>원문내용</td>
				<td>${reply_view.bContent}</td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea name= "bContent" id="summernote" rows= "10"></textarea>
				<script>
				
			    $(document).ready(function() {
			        $('#summernote').summernote({
			        	placeholder: '내용을 작성하세요',
			            tabsize: 2,
			            height: 100
			        });
			        
			    });
			  </script>

				</td>
			</tr>
			<tr>
				<td colspan= "2">
					<input type="submit" value= "답변"> &nbsp;&nbsp;
					<a href="list.do?page=<%= session.getAttribute("cpage")%>">목록보기</a>
				</td>
			</tr>
		</form>
	</table>
	인생은 즐거워
</body>
</html>