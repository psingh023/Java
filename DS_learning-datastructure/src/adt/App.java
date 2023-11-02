package adt;

public class App {

	public static void main(String[] args) {
		Counter myCounter = new Counter("myCounter");
		myCounter.increament();
		myCounter.increament();
		myCounter.increament();
		myCounter.increament();
		myCounter.increament();
		myCounter.toString();
		
		System.out.println(myCounter.toString());
		
	}

}
