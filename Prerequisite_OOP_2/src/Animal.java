
public abstract class Animal {

	int age;
	int height;
	int weight;
	String gender;
	
	public Animal(int age, int height, int weight, String gender) {

		this.age = age;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
	}
	
	public void speak() {
		System.out.println("Age is " + age +  " years old");
		System.out.println("Height is " + height + " inchs");
		System.out.println("Weight is " + weight + " pounds");
		System.out.println("Gender is " + gender);			
	}

	public void eat() {
		System.out.println("eating...");
	}
	public void sleep() {
		System.out.println("sleeping...");
	}
	public abstract void move();
	
	
}
