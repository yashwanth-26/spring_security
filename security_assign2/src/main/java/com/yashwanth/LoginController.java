package com.yashwanth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	
	
	@GetMapping("/login")
	public String login() {
		return "login";
		
	}
	@ResponseBody
	@RequestMapping("/admin")
	public String admin()
	{
		return "hi admin";
		
	}

}
