package com.example.springbootstudy.other;

import java.util.Random;
import java.util.concurrent.Future;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

@Component
public class Task {
	public static Random rd = new Random();

	@Async
	public Future<String> doOne() throws InterruptedException {
		System.out.println("开始做任务一");
		long start = System.currentTimeMillis();
		Thread.sleep(rd.nextInt(10000));
		long end = System.currentTimeMillis();
		System.out.println("完成任务一，耗时：" + (end - start) + "毫秒");
		return new AsyncResult<>("任务一完成");
	}

	@Async
	public void doTwo() throws InterruptedException {
		System.out.println("开始做任务二");
		long start = System.currentTimeMillis();
		Thread.sleep(rd.nextInt(10000));
		long end = System.currentTimeMillis();
		System.out.println("完成任务二，耗时：" + (end - start) + "毫秒");
	}
}
