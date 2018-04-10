package com.example.springbootstudy.test.respository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.springbootstudy.Application;
import com.example.springbootstudy.entity.People;
import com.example.springbootstudy.respository.PeopleRespository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class PeopleRespositoryTest {
	@Autowired
	private PeopleRespository peopleRespositroy;

	@Test
	public void test() {
		peopleRespositroy.save(new People("张三", 21));
		peopleRespositroy.save(new People("李四", 22));
		peopleRespositroy.save(new People("王五", 23));
		peopleRespositroy.save(new People("赵六", 24));
	}
}
