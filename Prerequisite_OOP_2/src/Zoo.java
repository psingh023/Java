
public class Zoo {

	public static void main(String[] args) {
		
//		Animal animal1 = new Animal(4, 32, 128, "M");
//		//Animal getting error "Cannot Initiate the type animal because its converted to abstract class"
//		animal1.speak();
//		animal1.sleep();
//		animal1.eat();
		
//		Animal sparrow2 = new Sparrow(1, 2, 5, "M");
		//The object is not type animal the object is type sparrow
		//But the variable that points to that object is of type animal
		//sparrow2.move();
		//we cannot make the sparrow fly() its not part of animal specification
		//we can only call higher level method which is move()
		
		
//		Sparrow sparrow1 = new Sparrow(1, 2, 5, "M");
		//sparrow1.fly();
		//We have define the Sparrow class here not animal so it will have other methods
		//sparrow1.move();
		
//		Bird bird1 = new Bird(4, 52, 477, "F");
//		bird1.fly();
		

//		Animal fish1 = new Fish(1, 23, 12, "M");
		//fish1.move();
		
//		Fish fish2 = new Fish(1, 23, 12, "M");
		//fish2.swim();
		//fish2.move();
		
//		Chicken chick1 = new Chicken(2, 44, 45, "M");
//		chick1.fly();
		
//		moveAnimal(fish1);
//		
//		moveAnimal(sparrow1);
		
		Flyable flyingBird = new Sparrow(5, 14, 47, "F");
		flyingBird.fly();

	}
	
//	public static void moveAnimal(Animal animal) {
//		//We are passing to 
//		animal.move();
//	}
	
	
	

}
