package com.DojosAndNinjas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.DojosAndNinjas.models.Dojo;
import com.DojosAndNinjas.services.DojoService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/dojos")
public class DojoController {
	// DI
	@Autowired
	private DojoService dojoServ;

	// Display Dojos creation form
	@GetMapping("")
	public String alldojos(@ModelAttribute Dojo dojo, Model model) {
		List<Dojo> alldojos = dojoServ.allDojos();
		model.addAttribute("dojos", alldojos);
		return "dojo.jsp";
	}

	// create a dojo
	@PostMapping("/processDojo")
	public String processDojo(@Valid @ModelAttribute Dojo dojo, BindingResult result, Model model) {
		if (result.hasErrors()) {
			List<Dojo> alldojos = dojoServ.allDojos();
			model.addAttribute("dojos", alldojos);
			return "dojo.jsp";
		}
		// save the dojo to the DB
		dojoServ.createDojo(dojo);
		return "redirect:/dojos";
	}

	// show one publisher
	@GetMapping("/{id}")
	public String oneDojo(@PathVariable Long id, Model model) {
		Dojo savedDojo = dojoServ.findDojoById(id);
		model.addAttribute("dojo", savedDojo);
		return "oneDojo.jsp";
	}

}
