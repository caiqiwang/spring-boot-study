package com.example.springbootstudy.manager;

import com.example.springbootstudy.entity.User;

public interface UserManager {
	void create(String name, int age);

	User selectByName(String name);

	void DeleteAll();

	void DeleteByName(String name);
}
