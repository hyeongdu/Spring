package com.study.spring.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.spring.command.*;

@Controller
public class BController {
	
	Bcommand command = null;
	
	@RequestMapping("/list")
	public String list(HttpServletRequest request, Model model) throws ServletException, IOException {
		
		System.out.println("list()");
		command = new BListCommand();
		command.execute(request, model);
		
		return "list";
	}
	
	
	@RequestMapping("/content_view")
	public String content_view(HttpServletRequest request, Model model) throws ServletException, IOException {
		
		System.out.println("content_view");
		command = new BContentCommand();
		command.execute(request, model);
		
		return "content_view";
	}
	
	@RequestMapping("/write_view")
	public String write_view(HttpServletRequest request, Model model) throws ServletException, IOException {
		
		System.out.println("write_view");
	
		
		return "write_view";
	}
	
	@RequestMapping("/modify_view")
	public String modify_view(HttpServletRequest request, Model model) throws ServletException, IOException {
		
		System.out.println("modify");
		command = new BContentCommand();
		command.execute(request, model);
		
		return "modify_view";
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request, Model model) throws ServletException, IOException {
		
		System.out.println("delete");
		command = new BDeleteCommand();
		command.execute(request, model);
		
		return "redirect:list";
	}
	
	@RequestMapping("/reply_view")
	public String reply_view(HttpServletRequest request, Model model) throws ServletException, IOException {
		
		System.out.println("reply_view");
		command = new BReplyViewCommand();
		command.execute(request, model);
		
		return "reply_view";
	}
	
	@RequestMapping("/modify")
	public String modify(HttpServletRequest request, Model model) throws ServletException, IOException {
		
		System.out.println("modify");
		command = new BModifyCommand();
		command.execute(request, model);
		
		return "redirect:list";
	}
	
	@RequestMapping("/reply")
	public String reply(HttpServletRequest request, Model model) throws ServletException, IOException {
		
		System.out.println("reply");
		command = new BReplyCommand();
		command.execute(request, model);
		
		return "redirect:list";
	}
	
	@RequestMapping("/write")
	public String write(HttpServletRequest request, Model model) throws ServletException, IOException {
		
		System.out.println("write");
		command = new BWriteCommand();
		command.execute(request, model);
		
		return "redirect:list";
	}
	
	
	

}
