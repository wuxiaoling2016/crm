package com.newer.dao;

import java.util.List;

import com.newer.model.User;

public interface UserMapper {
	User findById(Integer id);
	List<User> findAll();
	void addUser(User user);
	void updateUser(User user);
	void deleteUser(Integer id);
}
