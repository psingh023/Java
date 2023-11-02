package lesson3;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Application {

	public static void main(String[] args) {
		//HashSet - store the values without duplicate's and not maintain insertion order
		HashSet<Integer> values = new HashSet<Integer>();
		values.add(12);
		values.add(43);
		values.add(15);
		values.add(67);
		values.add(67);
		values.add(67);
		values.add(43);
		
//		for(Integer value : values) {
//			System.out.println(value);
//		}
		//>>OUTPUT>> 67, 43, 12, 15

		//LinkedHashSet - store the values without duplicate's and maintain insertion order
		LinkedHashSet<String> wordValues = new LinkedHashSet<String>();
		wordValues.add("Insect");
		wordValues.add("Animal");
		wordValues.add("People");
		wordValues.add("School");
		wordValues.add("School");
		wordValues.add("School");
		wordValues.add("Car");
		wordValues.add("People");
		
//		for(String Wvalue : wordValues) {
//			System.out.println(Wvalue);
//		}
		//>>OUTPUT>> Insect, Animal, People, School, Car		
		
		//HashSet(Objects) - store the values without duplicate's and not maintain insertion order
		//Note: The object value will only be stored unique not duplicates if the equals() and hashCode() defined 
		HashSet<Animal> animals = new HashSet<Animal>();
		
		Animal animal1 = new Animal("Dog", 12);
		Animal animal2 = new Animal("Cat", 7);
		Animal animal3 = new Animal("Bird", 3);
		Animal animal4 = new Animal("Dog", 12);
		Animal animal5 = new Animal("Kangaroo", 15);
		Animal animal6 = new Animal("Dog", 12);
		
		animals.add(animal1);
		animals.add(animal2);
		animals.add(animal3);
		animals.add(animal4);
		animals.add(animal5);
		animals.add(animal6);
		
		System.out.println(animal1.equals(animal4));
		
		System.out.println(animal1.hashCode());
		System.out.println(animal4.hashCode());
		
		for(Animal value : animals) {
			System.out.println(value);
		}
		//OUTPUT
		//Animal [name=Dog, age=12]
		//Animal [name=Kangaroo, age=15]
		//Animal [name=Cat, age=7]
		//Animal [name=Bird, age=3]
	}

}
