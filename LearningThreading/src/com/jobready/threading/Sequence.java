package com.jobready.threading;

public class Sequence {
	
//This is a shared data and the thread can pause anywhere and control given to another thread	
	private int value = 0;
	
//	public int getNext() {

//Not Thread safe this involve multiple steps 
//which it can stop any time and hand the control to another thread
//		value = value + 1; << This involve three steps
//		value++;
		
//Thread Safe we need to make it Automaticity = All or nothing
//We need to define the synchronized block and specify the object which is (this)
//synchronized should return the updated value
//synchronized guarantee automaticity
		
//		synchronized (this) {
//			value = value + 1;
//			return value;
//		}
		
		
//		return value;
//	}

	
// Another way to add synchorized to method definition 
// Now the method, a signature has been given the synchronized keyword

	public synchronized int getNext() {
		
		value = value + 1;
		return value;	
		
	}
	
	
}
