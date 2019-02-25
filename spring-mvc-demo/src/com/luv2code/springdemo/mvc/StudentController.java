package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		// create a new student object
		Student theStudent = new Student();
		
		// add student as a model attribute
		theModel.addAttribute("student", theStudent);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm") 
	public String processForm(@ModelAttribute("student") Student theStudent) {
		
		System.out.println(theStudent.getFirstName());
		
		System.out.println(theStudent.getLastName());
		
		return "student-confirmation";
		
	}

}
