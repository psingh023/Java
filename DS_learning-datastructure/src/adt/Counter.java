package adt;

public class Counter {

	private String name;
	private int value = 0;
	
	public Counter(String str) {
		super();
		this.name = str; 
	}

	public void increament() {
		value++;
	}

	public int getCurrentValue() {
		return value;
	}
	
	public String toString() {
		return name + ": " + value;
	}
}
