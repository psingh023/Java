
public class Sparrow extends Bird implements Flyable{

	public Sparrow(int age, int height, int weight, String gender) {
		super(age, height, weight, gender);
	}

	public void fly() {
		System.out.println("Sparrow flying high...");
	}

}
