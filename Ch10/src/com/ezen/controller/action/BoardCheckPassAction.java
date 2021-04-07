package com.ezen.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ezen.dao.BoardDAO;
import com.ezen.dto.BoardVO;

public class BoardCheckPassAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//
		String path=null;
		int num=Integer.parseInt(request.getParameter("num"));
		String pass=request.getParameter("pass");
		
		System.out.println(num);
		System.out.println(pass);
		
		BoardDAO boardDAO=BoardDAO.getInstance();
		BoardVO boardVO=boardDAO.selectOneBoardByNum(num);
		
		if(boardVO.getPass().equals(pass)) {
			//비밀번호가 일치할 경우 게시물 삭제 가능
			path="board/checkSuccess.jsp";
		}else {
			 path = "board/boardCheckPass.jsp";
			 request.setAttribute("msg", "비밀번호가 틀렸습니다.");
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		dispatcher.forward(request, response);
	}

}
