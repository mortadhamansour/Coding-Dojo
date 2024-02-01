package com.codingdojo.HelloHuman.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Human {
	public String index() {
		return "Hello Human";
	}
	@GetMapping("/")
	public String greeting(@RequestParam(value="name", required=false) String searchQuery) {
		if (searchQuery == null) {
			return "Hello Human";
		}
		return "Hello " + searchQuery;
	}
}