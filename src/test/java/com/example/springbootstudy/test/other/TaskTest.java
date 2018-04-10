package com.example.springbootstudy.test.other;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.springbootstudy.Application;
import com.example.springbootstudy.other.Task;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TaskTest {
	@Autowired
	private Task task;

	@Test
	public void test() throws Exception {
		task.doOne();
		task.doTwo();
	}

}
