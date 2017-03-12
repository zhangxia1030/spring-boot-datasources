package com.zx.service;

import java.util.List;

import com.zx.entity.test1.User1;

public interface TestService1 {
	
	List<User1> getAll();
	
	User1 getOne(Integer id);

	void insert(User1 user);

	void update(User1 user);

	void delete(Integer id);
}
