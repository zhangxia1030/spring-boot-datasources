package com.zx.dao.test2;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zx.entity.test2.User2;

public interface TestMapper2 {
	
	List<User2> getAll();
	
	User2 getOne(Integer id);

	void insert(User2 user);

	void update(User2 user);

	void delete(Integer id);
}
