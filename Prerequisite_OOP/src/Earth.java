
public class Earth {
	public static void main(String args[]) {
		
//		Human tom;
//		
//		tom = new Human();
//		tom.age = 5;
//		tom.eyeColor = "brown";
//		tom.heightInInches = 72;
//		tom.name = "Tom the cat";
//		
//		tom.speak();
//		
//		Human joe = new Human();
//		joe.age = 52;
//		joe.eyeColor = "green";
//		joe.heightInInches = 102;
//		joe.name = "joe the bird";
//		
//		joe.speak();
		
		Human human1 = new Human("Tom", 22, 150, "Blue");
		Human human2 = new Human("Nick", 58, 180, "Red");
		
		human1.speak();
		human2.speak();
		
	}
}
