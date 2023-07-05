package com.springPr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springPr.model.Employee;
import com.springPr.model.User;
import com.springPr.service.EmService;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

@Controller
public class HomeController {
	
	@Autowired
	private  EmService emService;
	
	@RequestMapping("/home")
	public String home()
	{
		return "home";
	}
	@RequestMapping(path="/login", method=RequestMethod.GET)
	public ModelAndView log() {
		ModelAndView mv= new ModelAndView("login");
		mv.addObject( "login", new User());
		return mv;
	}
	
	@RequestMapping(path="/signup", method=RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("user") User user,Model m, Employee employee) {
		ModelAndView mv=null;
		Employee emp= emService.validateUser(user);
		if(emp != null) {
			mv= new ModelAndView("signup")	;
			m.addAttribute("success", "sucessfully login");
		}
		else {
			mv = new ModelAndView("login");
			mv.addObject("lmsg","Invalid username and Password");
		}
		return mv;
	}

	@RequestMapping("/register")
	public String registerE()
	{
		return "register";
	}
	
	@RequestMapping(path="/Registered", method= RequestMethod.POST)
	public String register(@ModelAttribute Employee employee,Model m)
	{
		emService.register(employee);
		System.out.println(employee);
		m.addAttribute("msg","Register Successfully");
		return "Registered";	
	}
}
