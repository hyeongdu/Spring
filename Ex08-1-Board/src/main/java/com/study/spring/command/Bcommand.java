package com.study.spring.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;

public interface Bcommand 
{
	void execute(HttpServletRequest request, Model model)
			throws ServletException, IOException;
	
}
