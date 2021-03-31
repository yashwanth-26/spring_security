package com.yashwanth;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Assign1Controller {
	
	
	@RequestMapping("/admin")
	public String helloWorld()
	{
		return "HELLO WORLD";
		
	}

}
