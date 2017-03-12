package com.zx.dao.test1;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zx.entity.test1.User1;

@Mapper
public interface TestMapper1 {
	
	List<User1> getAll();
	
	User1 getOne(Integer id);

	void insert(User1 user);

	void update(User1 user);

	void delete(Integer id);
}
