
public class Bird extends Animal{
//Once Bird class extends Animal class it inherit the animal class functionality 	
	public Bird(int age, int height, int weight, String gender) {
		super(age, height, weight, gender);
		//Super is the parent class "Animal" constructor parameters
	}

	public void move() {
		System.out.println("Flapping wings...");
	}

//	public void fly() {
//		System.out.println("Flying...");
//	}
}
