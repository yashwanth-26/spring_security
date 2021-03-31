package com.yashwanth;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JdbcController {
	
	@RequestMapping("/")
	public String welcome()
	{
		return "hello";
		
	}
	@RequestMapping("/user")
	public String userPage() {
		return "Hello User";
	}
	@RequestMapping("/admin")
	public String adminPage() {
		return "Hello Admin";
	}



}
