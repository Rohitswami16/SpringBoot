package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/App")
public class FirstController {

	public FirstController() {
		System.out.println("Started");
	}

	@RequestMapping("/greet")

	@ResponseBody
	String greet() {
		return "Hello user";
	}

	@RequestMapping("/byebye")
	@ResponseBody
	String syaGoodbye() {
		return "Goodbye";
	}
}
