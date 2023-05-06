package com.verill.multi;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorsExample {
	
	public static void main(String[] args) {
		ScheduledExecutorService scheduleService = Executors.newScheduledThreadPool(1);
		Runnable tasks = () -> {
			System.out.println("Executing task at "+System.nanoTime());
		};
		
		System.out.println("Submitting task at "+System.nanoTime()+" to be executed after 5 secs");
		scheduleService.schedule(tasks, 5, TimeUnit.SECONDS);
		
		scheduleService.shutdown();
		
	}

}
