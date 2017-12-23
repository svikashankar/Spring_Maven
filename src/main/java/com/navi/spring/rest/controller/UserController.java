package com.navi.spring.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.navi.spring.rest.dto.UserDTO;
import com.navi.spring.rest.model.service.UserService;

//@Controller
@RestController
public class UserController {

	@Autowired
	private UserService service;

	// @ResponseBody
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public List<UserDTO> getUsers() {
		return service.getAllUsers();
	}
	
	//@ResponseBody
		@RequestMapping(value = "/{userId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public UserDTO getUser(@PathVariable int userId) {
			return service.getUserById(userId);
		}
		
		@ResponseStatus(code = HttpStatus.CREATED)
		@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
		public UserDTO createUser(@RequestBody UserDTO user) {
			return service.createUser(user);
		}
		
		/*@RequestMapping(value = "/{id}",method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
		public void removeUser(@PathVariable int userId) {
			
		}*/
		
		
		@RequestMapping(value = "/{id}",method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
		public UserDTO updateUser(@PathVariable int id,@RequestBody UserDTO user) {
			return service.updateUser(id, user);
		}

}
