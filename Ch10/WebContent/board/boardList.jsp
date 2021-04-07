<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 목록 보기</title>
</head>
<body>
	<div align="center">
		<h1>게시글 리스트</h1>
		<table border="1">
			<tr>
				<th>번호</th>
				<th>제목</th> 
				<th>작성자</th> 
				<th>작성일</th> 
				<th>조회수</th>
			</tr>
			<c:forEach var="board" items="${boardList }">
			<tr>
				<td>${board.num }</td> 
				<td><a href="board.do?command=board_view&num=${board.num}"/>
				${board.title}</td> 
				<td>${board.name }</td> 
				<td><fmt:formatDate value="${board.writedate}" /></td> 
				<td>${board.readCount }</td> 
			</tr>
			</c:forEach>
		</table>
		<a href="board.do?command=board_write_form">게시글 등록</a>
	</div>
</body>
</html>