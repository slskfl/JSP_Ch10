<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 등록</title>
</head>
<body>
	<div align="center">
	<h1>게시글 등록</h1>
		<form name="frm" method="post" action="board.do">
			<input type="hidden" name="command" value="board_write"/>
			<table>
				<tr>
					<th>작성자*</th>
					<td>
						<input type="text" size="30" name="name" />
					</td>	
				</tr>
				<tr>
					<th>비밀번호*</th>
					<td>
						<input type="password" size="30" name="pass"/>
						필수(게시글 수정 및 삭제 시 필요합니다.)
					</td>	
				</tr>
				<tr>
					<th>이메일*</th>
					<td>
						<input type="text" size="20" maxlength="30" 
						name="email" />
					</td>	
				</tr>
				<tr>
					<th>제목*</th>
					<td>
						<input type="text" size="50"
						name="title" />
					</td>	
				</tr>
				<tr>
					<th>내용*</th>
					<td>
						<textarea rows="15" cols="70" name="content"></textarea>
					</td>	
				</tr>
			</table>
			<br>
			<input type="submit" value="등록" 
				onclick="return boardCheck();"/>
			<input type="reset" value="다시 작성" />
			<input type="button" value="목록"
				onclick="location.href='board.do?command=board_list'"/>
		</form>
	</div>
</body>
</html>