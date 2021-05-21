package com.study.spring10;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	
	@RequestMapping("/studentForm")
	public String studentForm() {
		
			return "createPage";
		}

	
	@RequestMapping("/student/create")
	public String studentOk(@ModelAttribute("student") Student student
			,BindingResult result) {
		
	String page = "createDonPage";
	
	StudentValidator validator = new StudentValidator();
	validator.validate(student, result);
	if(result.hasErrors()) {
		page = "createPage";
	}
	return page;
	}
	

	@RequestMapping("/studentNg")
	public String studentNg(Model model) {
		return "student/studentNg";
	}

}
