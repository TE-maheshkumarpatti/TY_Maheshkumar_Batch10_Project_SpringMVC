package com.tyss.demo.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SpringMVCcontroller {

	@GetMapping("/login")
	public String getLoginPage() {
		System.out.println(" inside ");
		return "loginPage";
	}

	@PostMapping("/login")
	public String getFormData(HttpServletRequest request, ModelMap map) {
		String username = request.getParameter("user");
		String password = request.getParameter("pwd");
		;

		map.addAttribute("user", username);
		map.addAttribute("pwd", password);
		return "home";
	}
}
