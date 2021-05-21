package com.study.spring03;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Mycontroller {
	
	@RequestMapping("/view")
	public String view() {
		 return "board/view";
	}
	
	@RequestMapping("/content")
	public String content(Model model) {
		
		model.addAttribute("id", 30);
		 return "board/content";
	}
	
	@RequestMapping("/reply")
	public ModelAndView reply() {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("id", 30);
		mv.setViewName("board/reply");
		 return mv;
	}
	
	

}
