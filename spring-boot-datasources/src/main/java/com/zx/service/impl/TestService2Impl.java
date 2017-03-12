package com.zx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zx.dao.test2.TestMapper2;
import com.zx.entity.test2.User2;
import com.zx.service.TestService2;

@Service
public class TestService2Impl implements TestService2{
	
	@Autowired
	TestMapper2 test2;

	@Override
	public List<User2> getAll() {
		return test2.getAll();
	}

	@Override
	public User2 getOne(Integer id) {
		return test2.getOne(id);
	}

	@Override
	public void insert(User2 user) {
		test2.insert(user);
	}

	@Override
	public void update(User2 user) {
		test2.update(user);
	}

	@Override
	public void delete(Integer id) {
		test2.delete(id);
	}


}
