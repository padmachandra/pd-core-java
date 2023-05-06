package com.verill.multi;

public class TestCallRun extends Thread {

	public void run() {
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) throws InterruptedException {
		TestCallRun t1 = new TestCallRun();
		TestCallRun t2 = new TestCallRun();

		t1.start();
///Current thread will be paused, until t1 is dead. (t1 will start executing)	
		t1.join();
		t2.start();
	
		//t1.join();   
//Current thread will be paused, t1 will execute for 1500 milliseconds.		
		//t1.join(1500);  

		
	}

}
