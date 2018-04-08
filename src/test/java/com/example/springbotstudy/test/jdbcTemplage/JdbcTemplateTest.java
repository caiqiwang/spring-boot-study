package com.example.springbotstudy.test.jdbcTemplage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.springbootstudy.dao.UserDao;
import com.example.springbootstudy.entity.User;

@RunWith(SpringRunner.class)
// @SpringBootTest(classes = Application.class)
public class JdbcTemplateTest {
	@Autowired
	private UserDao userDao;

	@Before
	public void setUp() {
		userDao.DeleteAll();
	}

	@Test
	public void userAction() throws Exception {
		// int count = userDao.countAll();
		// Assert.assertEquals(0, count);

		userDao.create("Li", 23);

		User user = userDao.selectByName("Li");
		Assert.assertEquals(23, user.getAge());
	}
}
