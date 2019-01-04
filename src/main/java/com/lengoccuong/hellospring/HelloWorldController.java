package com.lengoccuong.hellospring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	
	@RequestMapping("/hello")
	public String sayHello(ModelMap map) {
		map.addAttribute("msg","Learn Java");
		return "hello";
	}

}
