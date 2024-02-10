package com.LoginAndRegistration.repositories;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

import com.LoginAndRegistration.models.User;

public interface UserRepository extends CrudRepository<User, Long> {

	// for logging user
	Optional<User> findByEmail(String email);

}
