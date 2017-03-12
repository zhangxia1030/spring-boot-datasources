package com.zx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zx.dao.test1.TestMapper1;
import com.zx.entity.test1.User1;
import com.zx.service.TestService1;

@Service
public class TestService1Impl implements TestService1{
	
	@Autowired
	TestMapper1 test1;

	@Override
	public List<User1> getAll() {
		return test1.getAll();
	}

	@Override
	public User1 getOne(Integer id) {
		return test1.getOne(id);
	}

	@Override
	public void insert(User1 user) {
		test1.insert(user);
	}

	@Override
	public void update(User1 user) {
		test1.update(user);
	}

	@Override
	public void delete(Integer id) {
		test1.delete(id);
	}


}
