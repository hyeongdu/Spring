package com.study.spring.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;

import com.study.spring.dao.BDao;
import com.study.spring.dto.BDto;

public class BContentCommand implements Bcommand
{
	@Override
	public void execute(HttpServletRequest request,Model model)
	
	{
		String bId = request.getParameter("bId");
		
		BDao dao = new BDao();
		BDto dto = dao.contentView(bId);
		System.out.println(dto.getbName());
		model.addAttribute("content_view", dto);
		
		System.out.println("BContentCommand");
	}
}
