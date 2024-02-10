package com.SaveTravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SaveTravels.models.Travel;
import com.SaveTravels.repositories.TravelRepository;

@Service
public class TravelService {

	@Autowired
	private TravelRepository travelRepo;

	// READ ALL
	public List<Travel> allTravels() {
		return travelRepo.findAll();
	}

	// CREATE
	public Travel createTravel(Travel T) {
		return travelRepo.save(T);
	}

	// READ ONE
	public Travel findTravelById(Long id) {
		Optional<Travel> maybeTravel = travelRepo.findById(id);
		if (maybeTravel.isPresent()) {
			return maybeTravel.get();
		} else {
			return null;
		}
	}

	// UPDATE
	public Travel updateTravel(Travel T) {
		return travelRepo.save(T);
	}

	// DELETE
	public void deleteTravel(Long id) {
		travelRepo.deleteById(id);
	}

}
