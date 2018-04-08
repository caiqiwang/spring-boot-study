package com.example.springbootstudy.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String index(ModelMap map) {
		map.addAttribute("host", "hello cqw");
		return "index"; // Controller 注解对应的是templates下的hello模板
	}
}
