package com.SaveTravels.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.SaveTravels.models.Travel;

public interface TravelRepository extends CrudRepository<Travel, Long> {
	List<Travel> findAll();
}
