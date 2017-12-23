package com.navi.spring.rest.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.navi.spring.rest.dto.UserDTO;

@Service
public class UserService {

	private Map<Integer, UserDTO> users = new HashMap<Integer, UserDTO>();

	public UserService() {
		users.put(1, new UserDTO(1, "Ramesh", "ramesh@gmail.com"));
		users.put(2, new UserDTO(2, "Suresh", "suresh@gmail.com"));
		users.put(3, new UserDTO(3, "test", "test@gmail.com"));
	}

	public List<UserDTO> getAllUsers() {
		return new ArrayList<UserDTO>(users.values());
	}
	
	public UserDTO getUserById(int id) {
		return users.get(id);
	}
	
	public UserDTO createUser(UserDTO user) {
		Integer noOfUsers = users.size();
		user.setUserId(noOfUsers + 1);
		users.put(noOfUsers + 1, user);
		return user;
	}
	
	public void deleteUser(int userId) {
		users.remove(users);
		
	}
	
	public UserDTO updateUser(int userId, UserDTO user) {
		UserDTO existingUser = users.get(userId);
		existingUser.setUserName(user.getUserName());
		existingUser.setEmailId(user.getEmailId());
		users.put(userId, existingUser);
		return existingUser;
	}
}
