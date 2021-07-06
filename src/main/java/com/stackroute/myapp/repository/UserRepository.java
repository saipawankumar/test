package com.stackroute.myapp.repository;

import java.util.ArrayList;
import java.util.List;

import com.stackroute.myapp.model.User;

public class UserRepository {
	
	
	List<User> userlist = new ArrayList<User>();
	
	public UserRepository(){
	}
	
	public List<User> getAllUsers(){
		return userlist;
	}
	
	
	public void addUser(User user) {
		userlist.add(user);
	}

}
