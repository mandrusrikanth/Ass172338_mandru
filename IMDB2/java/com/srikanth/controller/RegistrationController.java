package com.srikanth.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pojo.Signup;

@Controller
public class RegistrationController {
  @Autowired
  public UserService userService;
  @RequestMapping(value = "/register")
  public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
    ModelAndView mav = new ModelAndView("register");
    mav.addObject("signup", new Signup(null, null, null, null, 0));
    return mav;
  }
  @RequestMapping(value = "/registerProcess")
  public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,
  @ModelAttribute("signup") Signup signup) {
  userService.register(signup);
  return new ModelAndView("welcome", "firstname", signup.getFirstname());
  }
}