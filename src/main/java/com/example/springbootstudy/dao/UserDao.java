package com.example.springbootstudy.dao;

import com.example.springbootstudy.entity.User;

public interface UserDao {
	void create(String name, int age);

	User selectByName(String name);

	void DeleteAll();

	void DeleteByName(String name);
}
