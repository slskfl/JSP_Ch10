package com.ezen.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ezen.dao.BoardDAO;
import com.ezen.dto.BoardVO;

public class BoardWriteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		
		BoardVO boardVO=new BoardVO();
		boardVO.setName(request.getParameter("name"));
		boardVO.setEmail(request.getParameter("email"));
		boardVO.setPass(request.getParameter("pass"));
		boardVO.setTitle(request.getParameter("title"));
		boardVO.setContent(request.getParameter("content"));
		BoardDAO boardDAO=BoardDAO.getInstance();
		boardDAO.insertBoard(boardVO);
		new BoardListAction().execute(request, response);
	}

}
