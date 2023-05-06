package com.verill.multi;

import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorsPeriodicExample {

	public static void main(String[] args) {
		ScheduledExecutorService scheduledService = Executors.newScheduledThreadPool(1);
		
		Runnable task = () -> {
			System.out.println("Task excutes at "+System.nanoTime());
		};
		System.out.println("Scheduling to run task at every 2 seconds");
		scheduledService.scheduleAtFixedRate(task, 0, 2, TimeUnit.SECONDS);
		//scheduledService.shutdown();
	}
}
