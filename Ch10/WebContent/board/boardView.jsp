<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 상세 보기</title>
<script type="text/javascript" src="script/board.js"></script>
</head>
<body>

	<div align="center">
		<h1>게시글 상세 보기</h1>
		<table border="1">
			<tr>
				<th>작성자</th>
				<td>${boardVO.name}</td>
				<th>이메일</th>
				<td>${boardVO.email}</td>
			</tr>
			<tr>
				<th>작성일</th>
				<td><fmt:formatDate value="${boardVO.writedate}" /></td>
				<th>조회수</th>
				<td>${boardVO.readCount}</td>
			</tr>
			<tr>
				<th>제목</th>
				<td colspan="3">${boardVO.title}</td>
			</tr>
			<tr> 
				<th>내용</th> 
				<td colspan="3">${boardVO.content}</td> 
			</tr>
		</table>
		<input type="button" value="게시글 수정"
			onclick="open_win('board.do?command=check_pass_form&num=${boardVO.num}','update');"/>
		<input type="button" value="게시글 삭제"
			onclick="open_win('board.do?command=check_pass_form&num=${boardVO.num}','delete');"/>
		<input type="button" value="게시글 목록"
			onclick="location.href='board.do?command=board_list'"/>
		<input type="button" value="게시글 등록"
			onclick="location.href='board.do?command=board_write_form'"/>
	</div>
</body>
</html>