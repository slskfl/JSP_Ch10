package com.ezen.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ezen.dao.BoardDAO;
import com.ezen.dto.BoardVO;

public class BoardViewAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String path="board/boardView.jsp";
		int num=Integer.parseInt(request.getParameter("num"));
		
		BoardDAO boardDAO= BoardDAO.getInstance();
		boardDAO.updateReadCount(num);
		BoardVO boardVO=boardDAO.selectOneBoardByNum(num);
		
		request.setAttribute("boardVO", boardVO);
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		dispatcher.forward(request, response);
	}

}
