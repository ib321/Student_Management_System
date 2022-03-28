package com.lib.repository;

import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;

import com.lib.model.User;

/*
 * Implementing the UserRepository Class to do  Database operation
 */
public class UserRepositoryImpl {

	@Autowired
	UserRepository userRepository;
	
	
	/*
	 * take user model class as input and save that user into database
	 * by using userRepository
	 */
	public void saveUser(User user) {
		userRepository.save(user);
	}
	
	/*
	 * it takes all the user from database and returns list of all the user
	 */
	public ArrayList<User> getAllUser() {
		return (ArrayList<User>) userRepository.findAll();
	}


}
