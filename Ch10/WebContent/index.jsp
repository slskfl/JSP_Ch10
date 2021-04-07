<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인</title>
</head>
<body>
	<%
	/* 메인 페이지에 보여 줄 내용이 없음 >>강제적으로 페이지 이동 */
	 response.sendRedirect("http://localhost:8181/Ch10/board.do?command=board_list");
	%>
</body>
</html>