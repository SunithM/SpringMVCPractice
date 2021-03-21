package com.suni.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	// need controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	// need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	// new controller method to read form data
	@RequestMapping("/processFormVersionTwo")
	public String letsShout(HttpServletRequest request, Model model) {
		// request parameter form html form
		String theName = request.getParameter("studentName");

		// convert into upper case
		theName = theName.toUpperCase();
		// create message
		String result = "Yo ! " + theName;
		// add to the form model
		model.addAttribute("message", result);

		return "helloworld";
	}

	// demonstrate @RquestParam
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {

		theName = theName.toUpperCase();
		// create message
		String result = "Hey My friend " + theName;
		// add to the form model
		model.addAttribute("message", result);
		return "helloworld";
	}

}
