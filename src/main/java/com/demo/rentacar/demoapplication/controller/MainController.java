package com.demo.rentacar.demoapplication.controller;

import java.security.Principal;

import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {

	@RequestMapping("/")
	public String contextPath() {
		return "home.jsp";
	}
	
	@RequestMapping("/home")
	public String home() {
		return "home.jsp";
	}
	
	
	@RequestMapping("/login")
	public String loginPage() {
		return "login.jsp";
	}
	
	@RequestMapping("/logout-success")
	public String logoutPage() {
		return "logout.jsp";
	}
	
	@RequestMapping(value="/hello")
	@ResponseBody
	public String greeting() {
		return "Hello Spring Boot";
	}
	
	
	
	@RequestMapping("user")
	@ResponseBody
	public Principal user(Principal principle) {
		return principle;
		
	}
}
