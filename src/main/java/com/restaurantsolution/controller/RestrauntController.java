package com.restaurantsolution.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurantsolution.domain.AppUser;

@Controller
//@RequestMapping("/Restaurant")
public class RestrauntController {

	@Autowired
	ServletContext context;
	
@GetMapping("/")	
public String test() {
	
	return "hello";
	
}

@RequestMapping("/login/admin")
public String adminLoginPage(Model model) {
	model.addAttribute("context", context.getContextPath());
	return "adminlogin";
}

@RequestMapping("/login/user")
public String userLoginPage(Model model) {
	model.addAttribute("context", context.getContextPath());
	return "userlogin";
}

@RequestMapping("/index")
public String indexPage(Model model, Authentication auth) {
	AppUser user = (AppUser) auth.getPrincipal();
	model.addAttribute("context", context.getContextPath());
	model.addAttribute("userId", user.getUsername());
	if (user.getAppUserRoles().iterator().next().getUserRole().getRoleName().equals("admin")) {
		return "adminindex";
	}
	return "index";
}



	
	
}
