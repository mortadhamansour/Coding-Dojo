package com.OmikujiForm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/omikuji")
public class Omikuji {

	@GetMapping("")
	public String displayForm() {

		return "home.jsp";
	}

	@PostMapping("/processForm")
	public String process(@RequestParam("number") int number, @RequestParam("city") String city,
			@RequestParam("person") String person, @RequestParam("professional") String professional,
			@RequestParam("living") String living, @RequestParam("something") String something, HttpSession session) {

		System.out.println(number + city + living + person + professional + something);
		session.setAttribute("number", number);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("professional", professional);
		session.setAttribute("living", living);
		session.setAttribute("something", something);

		return " redirect:/show";
	}

	@GetMapping("/show")
	public String res() {

		return "show.jsp";

	}

}
