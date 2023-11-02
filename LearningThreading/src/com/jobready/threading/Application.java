package com.jobready.threading;



public class Application {

	public static void main(String[] args) {
		System.out.println("Starting Thread a");
		Task taskRunner = new Task("Thread a");
		taskRunner.start();
		
		
//		Another way to invoke the thread define Thread and implement Runnable Interface		
//		Thread t1 = new Thread(new Task("Thread a"));		


//		Create Thread with anonymous class 
//		Thread t1 = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				
//				for(int i=0; i < 1000; i++) {
//					System.out.println("number:" + i + "-" + Thread.currentThread().getName());
//					try {
//						Thread.sleep(10);
//					} catch (InterruptedException e) {
//						
//					}
//				}
//				
//			}
//				
//	});
//		t1.start();		
		
		
		
		System.out.println("Starting Thread b");
		Task taskRunner2 = new Task("Thread b");
		taskRunner2.start();

	}

}

// Create Class Task and extend the Thread Class
// Thread Class implement the Runnable interface which has method call run() it is a abstract method
// To create a run() method we need to @Override it 
class Task extends Thread {
	
// Implement Runnable interface to Task we want to be multi Threaded	
//class Task implements Runnable {

	String TaskName;
	
	public Task(String TaskName) {
		this.TaskName = TaskName;
	}

	public void run() {
		Thread.currentThread().setName(TaskName);
		for(int i=0; i < 1000; i++) {
			System.out.println("number:" + i + "-" + Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				
			}
		}
	}
}