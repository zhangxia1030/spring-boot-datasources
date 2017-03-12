package com.zx.service;

import java.util.List;

import com.zx.entity.test2.User2;

public interface TestService2 {
	
	List<User2> getAll();
	
	User2 getOne(Integer id);

	void insert(User2 user);

	void update(User2 user);

	void delete(Integer id);
}
