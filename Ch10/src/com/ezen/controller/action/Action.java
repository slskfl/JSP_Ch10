package com.ezen.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ezen.controller.ActionFactory;

public interface Action {
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException;
}
