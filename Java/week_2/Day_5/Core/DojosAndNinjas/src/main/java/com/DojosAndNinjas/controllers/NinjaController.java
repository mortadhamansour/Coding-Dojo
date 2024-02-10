package com.DojosAndNinjas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.DojosAndNinjas.models.Dojo;
import com.DojosAndNinjas.models.Ninja;
import com.DojosAndNinjas.services.DojoService;
import com.DojosAndNinjas.services.NinjaService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/ninjas")
public class NinjaController {

	// DI
	@Autowired
	private DojoService dojoServ;
	@Autowired
	private NinjaService ninjaServ;

	// display all ninjas
	@GetMapping("")
	public String home(@ModelAttribute("ninja") Ninja ninja, Model model) {
		// retrieve all ninjas from db
		List<Ninja> allNinjas = ninjaServ.allNinjas();
		model.addAttribute("allNinjas", allNinjas);
		// retrieve all dojos from db
		List<Dojo> allDojos = dojoServ.allDojos();
		model.addAttribute("dojos", allDojos);
		return "home.jsp";
	}

	// Process Ninjas
	@PostMapping("/processNinja")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
		if (result.hasErrors()) {
			// retrieve all ninjas from db
			List<Ninja> allNinjas = ninjaServ.allNinjas();
			model.addAttribute("allNinjas", allNinjas);
			// retrieve all publishers from db
			List<Dojo> allDojos = dojoServ.allDojos();
			model.addAttribute("dojos", allDojos);
			return "home.jsp";
		} else {
			Ninja newNinja = ninjaServ.createNinja(ninja);
			return "redirect:/ninjas";
		}

	}

	@DeleteMapping("/{id}")
	public String deleteNInja(@PathVariable("id") Long id) {

		ninjaServ.deleteNinja(id);

		return "redirect:/ninjas";
	}

	// Display Edit Form

	@GetMapping("/edit/{id}")
	public String getMethodName(Model model, @PathVariable("id") Long id) {
		// find the ninja by the id
		Ninja selectedNinja = ninjaServ.findNinjaById(id);
		model.addAttribute("ninja", selectedNinja);
		return "edit.jsp";
	}

	@PutMapping("/{id}")
	public String editNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {

		if (result.hasErrors()) {
			return "edit.jsp";
		} else {
			// if there are no errors save the updated ninja to DB
			ninjaServ.updateNinja(ninja);

			return "redirect:/ninjas";
		}
	}

}
