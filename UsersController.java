package com.restservices.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {

	@GetMapping //Queryparameter
	public String getUsers(@RequestParam(value="page") int pageno, @RequestParam(value="limit") int limitnumber) {
		return "http GET request was sent for page:" + pageno + "and limit is "+limitnumber;
	}
	
	
	
	@GetMapping(path="/{userID}") //path parameter
	public String getUser(@PathVariable String userID) {
		return "http GET request was sent for userid:" +userID;
	}
	
	@PostMapping
	public String createUser() {
		return "http POST request was sent";
	}
	
	@PutMapping
	public String updateUser() {
		return "http PUT request was sent";
	}
	
	@DeleteMapping
	public String deleteUser() {
		return "http DELETE  request was sent";
	}
}
