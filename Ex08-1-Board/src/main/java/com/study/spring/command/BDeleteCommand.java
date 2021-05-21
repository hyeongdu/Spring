package com.study.spring.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;

import com.study.spring.dao.BDao;



public class BDeleteCommand implements Bcommand
{
	@Override
	public void execute(HttpServletRequest request, Model model)
		
	{
		String bId = request.getParameter("bId");
	
		BDao dao = new BDao();
		dao.delete(bId);
	}
}
