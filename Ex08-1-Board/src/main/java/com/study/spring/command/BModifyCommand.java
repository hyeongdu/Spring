package com.study.spring.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;

import com.study.spring.dao.BDao;

public class BModifyCommand implements Bcommand
{
	
	@Override
	public void execute(HttpServletRequest request, Model model)
		
	{
		
		String bId = request.getParameter("bId");
		String bName = request.getParameter("bName");
		String bTitle = request.getParameter("bTitle");
		String bContent = request.getParameter("bContent");
			
		BDao dao = new BDao();
		dao.modify(bId, bName, bTitle, bContent);
		
	}
	
}
