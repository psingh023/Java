package com.jobready.threading;

public class Application2 {

	public static void main(String[] args) {
		
		Sequence sequence = new Sequence();
		
		
//		for(int i = 0; i <100; i++) {
//			System.out.println(sequence.getNext());
//		}
		
		Worker Worker1 = new Worker(sequence);
		Worker1.start();
		Worker Worker2 = new Worker(sequence);
		Worker2.start();
		
	}

}

class Worker extends Thread{
	
	Sequence sequence = null;

	public Worker(Sequence sequence) {
		this.sequence = sequence;
	}
	
	public void run() {
		for(int i = 0; i <100; i++) {
			System.out.println(Thread.currentThread().getName() + " got value: " + sequence.getNext());
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}


//OUTPUT
//Thread-1 got value: 148
//Thread-0 got value: 147
//Thread-1 got value: 149
//Thread-0 got value: 150
//Thread-0 got value: 151
//Thread-1 got value: 151
//Thread-0 got value: 152
//Thread-1 got value: 153
//Thread-1 got value: 155
//Thread-0 got value: 154
//Thread-1 got value: 156

