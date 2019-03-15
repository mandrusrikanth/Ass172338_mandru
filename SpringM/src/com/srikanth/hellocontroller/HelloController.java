package com.srikanth.hellocontroller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController {
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {

		ModelAndView model1= new ModelAndView("HelloPage");
		model1.addObject("welcomeMessage","welcome to the first Spring mvc application");
		return model1;
	}
	

}
