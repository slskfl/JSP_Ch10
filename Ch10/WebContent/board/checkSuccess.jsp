<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>성공</title>
<script type="text/javascript">
	if(window.name=='delete'){
		alert('삭제되었습니다.');
		window.opener.parent.location.href
		="board.do?command=board_delete&num=${param.num}";
	}else if(window,name='update'){
		window.opener.parent.location.href
		="board.do?command=board_update_form&num=${param.num}";
	}
	window.close();
</script>
</head>
<body>
<!-- 수정과 삭제할 경우 이곳으로 옴  -->
	
</body>
</html>