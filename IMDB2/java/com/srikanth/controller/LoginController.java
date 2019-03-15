package com.srikanth.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.loginService.LoginService;

@Controller
public class LoginController 
{

	@RequestMapping("/login")
	public ModelAndView loginMethod(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndView modelAndview=new ModelAndView();
		
		String name1=request.getParameter("email");
		String password1=request.getParameter("password");
		LoginService login=new LoginService(name1,password1);
		
		if(new LoginService().checkUser(login))
		{
			modelAndview.setViewName("Comment.jsp");
		}
		else
		{
			modelAndview.setViewName("Signup.jsp");
		}
	
		return modelAndview;
	}
	
	
	
}