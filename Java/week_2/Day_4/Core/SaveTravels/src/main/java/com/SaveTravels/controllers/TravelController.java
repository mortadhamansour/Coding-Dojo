package com.SaveTravels.controllers;

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

import com.SaveTravels.models.Travel;
import com.SaveTravels.services.TravelService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/expenses")
public class TravelController {

	@Autowired
	private TravelService travelserv;

	// display all travels
	@GetMapping("")
	public String home(@ModelAttribute("travel") Travel travel, Model model) {
		// retrieve all travels from db
		List<Travel> allTravels = travelserv.allTravels();
		model.addAttribute("allTravels", allTravels);
		return "home.jsp";
	}

	// display one travel
	@GetMapping("/{id}")
	public String displayTravel(@PathVariable("id") Long id, Model model) {
		Travel selectedTravel = travelserv.findTravelById(id);
		model.addAttribute("travel", selectedTravel);
		return "showone.jsp";

	}

	// Process Travel
	@PostMapping("/processTravel")
	public String createTravel(@Valid @ModelAttribute("travel") Travel travel, BindingResult result, Model model) {
		if (result.hasErrors()) {
			// retrieve all travels from db
			List<Travel> allTravels = travelserv.allTravels();
			model.addAttribute("allTravels", allTravels);
			return "home.jsp";
		} else {
			Travel newTravel = travelserv.createTravel(travel);
			return "redirect:/expenses";
		}

	}

	@DeleteMapping("/{id}")
	public String deleteTravel(@PathVariable("id") Long id) {

		travelserv.deleteTravel(id);

		return "redirect:/expenses";
	}

	// Display Edit Form

	@GetMapping("/edit/{id}")
	public String getMethodName(Model model, @PathVariable("id") Long id) {
		// find the travel by the id
		Travel selectedTravel = travelserv.findTravelById(id);
		model.addAttribute("travel", selectedTravel);
		return "edit.jsp";
	}

	@PutMapping("/{id}")
	public String editTravel(@Valid @ModelAttribute("travel") Travel travel, BindingResult result) {

		if (result.hasErrors()) {
			return "edit.jsp";
		} else {
			// if there are no errors save the updated travel to DB
			travelserv.updateTravel(travel);

			return "redirect:/expenses";
		}
	}

}
