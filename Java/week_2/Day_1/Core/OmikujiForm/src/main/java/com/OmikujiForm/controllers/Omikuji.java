package com.OmikujiForm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class Omikuji {
	@RequestMapping("/omikuji")
	public String index() {
		return "show.jsp";
	}
	@RequestMapping("/omikuji/show")
	public String message(
			@RequestParam(value ="number") Integer number,
			@RequestParam(value ="city") String city,
			@RequestParam(value ="person") String person,
			@RequestParam(value ="hobby") String hobby,
			@RequestParam(value ="thing") String thing,
			@RequestParam(value ="descreption") String descreption
			) {
		return "show.jsp";
	}
}
