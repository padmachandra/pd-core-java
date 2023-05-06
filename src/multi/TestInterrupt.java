package com.verill.multi;

public class TestInterrupt extends Thread {

	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("task");
		} catch (InterruptedException e) {
			System.out.println("Exception handled " + e);
		}
		System.out.println("thread is still running after exception...");
	}

	public static void main(String args[]) {
		TestInterrupt t1 = new TestInterrupt();
		t1.start();
		t1.interrupt();
	}
}
