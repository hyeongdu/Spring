package com.study.spring.command;

import java.io.IOException;
import java.util.ArrayList;


import javax.servlet.http.HttpServletRequest;


import org.springframework.ui.Model;

import com.study.spring.dao.BDao;
import com.study.spring.dto.BDto;

public class BListCommand implements Bcommand
{
	@Override
	public void execute(HttpServletRequest request, Model model)
		
	{
		
		
		BDao dao = new BDao();
		ArrayList<BDto> dtos = dao.list();
		model.addAttribute("list", dtos);
		
		System.out.println("listCommand");
	}
}
