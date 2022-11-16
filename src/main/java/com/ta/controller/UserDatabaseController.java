package com.ta.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ta.model.User;
import com.ta.repository.UserRepository;

@EnableJpaRepositories
@RestController
@RequestMapping("/usersDB/")
public class UserDatabaseController {

	@Autowired
	UserRepository repo;

	@GetMapping(value = "/getusersDB")
	public ResponseEntity<?> getUsersList() throws Exception {
		List<User> users = new ArrayList<>();
 		repo.findAll().forEach(users::add);
		return new ResponseEntity<>(users, HttpStatus.OK);
	}
}
