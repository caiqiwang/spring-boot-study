package com.example.springbootstudy.other;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTest {// 定时任务
	/*@Scheduled(fixedDelay = 5000) // 5秒后执行
	public void test1() {
		System.out.println("这里是定时任务1   fixedDelay");
	}
	*/
	@Scheduled(cron = "0 45 19 * * ?")
	public void test2() {
		System.out.println("这里是定时任务2   cron");
	}

}
