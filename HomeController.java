package com.ryankim.javarouting;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class HomeController {
	@RequestMapping("")
	public String coding() {
		return "Hello Coding Dojo!";
	}
	@RequestMapping("/python")
	public String codingPython() {
		return "Python/Django is awesome!";
	}
	@RequestMapping("/java")
	public String codingJava() {
		return "<h1>Java/Spring is better!!!</h1>";
	}
}
