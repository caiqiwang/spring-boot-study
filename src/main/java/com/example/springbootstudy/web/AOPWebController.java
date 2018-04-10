package com.example.springbootstudy.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AOPWebController {
	@RequestMapping("/value")
	public String getName(@RequestParam(value = "name") String name) {
		return "hello " + name;
	}
}
