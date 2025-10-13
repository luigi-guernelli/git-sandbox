package com.guernelli.crudrest.controller;

import java.awt.desktop.UserSessionEvent;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guernelli.crudrest.model.User;
import com.guernelli.crudrest.service.UserService;

/**
 * Documetazione: .controller/UserController.java
 * 
 * @RestConttroller: espone API REST
 * @RequestMapping("/api/users"): base url
 * @GetMapping - @PostMapping - @PutMapping - @DeleteMapping: metodi REST
 * 
 */

@RestController
@RequestMapping("/api/users") //<- collegamento attraverso all' URL
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}
	
	  @PostMapping
	    public User createUser(@RequestBody User user) {
	        return userService.createUser(user);
	    }
	  
	  @PutMapping("/{id}")
	  public User updateUser(@PathVariable Long id, @RequestBody User user) {
		  return userService.updateUser(id, user);
	  }
	  
	  @DeleteMapping("/{id}")
	  public void deleteUser(@PathVariable Long id) {
		  userService.deleteUser(id);
	  }
}
