package com.ezen.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ezen.dao.BoardDAO;
import com.ezen.dto.BoardVO;

import oracle.net.aso.b;

public class BoardUpdate implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		BoardVO boardVO=new BoardVO();
		boardVO.setNum(Integer.parseInt(request.getParameter("num")));
		boardVO.setName(request.getParameter("name"));
		boardVO.setEmail(request.getParameter("email"));
		boardVO.setPass(request.getParameter("pass"));
		boardVO.setTitle(request.getParameter("title"));
		boardVO.setContent(request.getParameter("content"));
		
		BoardDAO boardDAO = BoardDAO.getInstance();
		boardDAO.updateBoard(boardVO);
		
		//목록화면으로 이동하기 
		new BoardListAction().execute(request, response);
	}
}
