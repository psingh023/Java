
public class Fish extends Animal{

	public Fish(int age, int height, int weight, String gender) {
		super(age, height, weight, gender);
		//Super is the parent class "Animal" constructor with its parameters

	}

	public void swim() {
		System.out.println("Swimming...");
	}


	public void move() {
		System.out.println("The fish is swimming...");
	}
}
