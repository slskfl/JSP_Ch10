package com.ezen.controller;

import com.ezen.controller.action.Action;
import com.ezen.controller.action.BoardCheckPassAction;
import com.ezen.controller.action.BoardCheckPassFormAction;
import com.ezen.controller.action.BoardDelete;
import com.ezen.controller.action.BoardListAction;
import com.ezen.controller.action.BoardUpdate;
import com.ezen.controller.action.BoardUpdateFormAction;
import com.ezen.controller.action.BoardViewAction;
import com.ezen.controller.action.BoardWriteAction;
import com.ezen.controller.action.BoardWriteFormAction;

public class ActionFactory {
	private ActionFactory(){
		
	}
	
	private static ActionFactory instance=new ActionFactory();

	public static ActionFactory getInstance() { 
		return instance; 
	}
	
	public Action getAction(String command) { 
		Action action = null; 
		System.out.println("command : " + command); //메인에서 시작 시 
		if(command.equals("board_list")) {
			action = new BoardListAction();
		}else if(command.equals("board_view")) {
			action=new BoardViewAction();
		}else if(command.equals("check_pass_form")) { 
			action = new BoardCheckPassFormAction();
		}else if(command.equals("board_check_pass")) {
			action = new BoardCheckPassAction();
		}else if(command.equals("board_delete")) {
			action=new BoardDelete();
		}else if(command.equals("board_update_form")) {
			action=new BoardUpdateFormAction();
		}else if(command.equals("board_update")) { 
			action=new BoardUpdate();
		}else if(command.equals("board_write_form")) {
			action=new BoardWriteFormAction();
		}else if(command.equals("board_write")) {
			action=new BoardWriteAction();
		}
		return action; 
	}
}
