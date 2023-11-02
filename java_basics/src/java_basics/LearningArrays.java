package java_basics;

public class LearningArrays {

	public static void main(String[] args) {

		int [] values = new int[100]; 
		values[0] = 100;
		values[1] = 23;
		values[99] = 200;

		System.out.println(values[0]);	
		
		String [] words = new String[3];
		words[0] = "My";
		words[1] = "Name";
		words[2] = "Is";
		
		System.out.println(words[0]);
	}

}
