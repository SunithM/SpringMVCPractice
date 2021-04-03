package com.suni.springmvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping("/student")
 
public class StudentController {
	
	@Value("#{countryOptions}")
    private Map<String, String> countryOptions;
	
	@RequestMapping("/registration")
	public String showForm(Model theModel) {

		//create student object
		Student theStudent=new Student();

		//add student object to the model
		theModel.addAttribute("student",theStudent);
		// add the country options to the model 
	    theModel.addAttribute("theCountryOptions", countryOptions); 
		return"student-form";
	}
	
	@RequestMapping("processForm")
	public String processform(@ModelAttribute("student") Student theStudent) {
		
		System.out.println("theStudent: "+theStudent.getFirstName());
		System.out.println("theStudent: "+theStudent.getLastName());
		return "student-confirmation";
	}

}
