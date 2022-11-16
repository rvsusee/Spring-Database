package com.ta.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ta.model.User;
import com.ta.repository.UserRepository;

@EnableJpaRepositories
@RestController
@RequestMapping("/main/")
public class UserDatabaseController {

	@Autowired
	UserRepository repo;

	@GetMapping(value = "/users")
	public ResponseEntity<?> getUsersList() throws Exception {
		List<User> users = new ArrayList<>();		
		users.addAll(repo.findAll());
		return new ResponseEntity<>(users, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/newUser", method = RequestMethod.GET)
	public String addNewUser(@RequestParam Map<String,String> inputs) throws Exception{
		User currUser = new User(inputs.get("email"), inputs.get("password"));
		repo.addNewUser(currUser);
		int currUserId = repo.findByEmail(currUser); 
		if(currUserId == 0) {
			return "Unable to Add User";
		}else {
			return "User Id: "+currUserId;
		}
	}
	
	
	
}
