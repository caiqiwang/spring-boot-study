package com.example.springbootstudy.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootstudy.dao.UserDao;
import com.example.springbootstudy.entity.User;
import com.example.springbootstudy.manager.UserManager;

@Service
public class UserManagerImpl implements UserManager {
	@Autowired
	private UserDao userDao;

	@Override
	public void create(String name, int age) {
		// TODO Auto-generated method stub

	}

	@Override
	public User selectByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void DeleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public void DeleteByName(String name) {
		// TODO Auto-generated method stub

	}

}
