package lesson2;

import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Application {

	public static void main(String[] args) {
		//Initialize Object
//		ArrayList<String> animals = new ArrayList<String>();
		
		List<String> animals = new ArrayList<String>();
		
		animals.add("Lion");
		animals.add("cat");
		animals.add("dog");
		animals.add("bird");
		
//		for(int i = 0; i < animals.size(); i++) {
//			System.out.println(animals.get(i));
//		}
//		
//		for(String value : animals) {
//			System.out.println(value);
//		}
		
		
		//Initialize Object
//		LinkedList<Vehicle> vehicles = new LinkedList<Vehicle>();
		
		List<Vehicle> vehicles = new LinkedList<Vehicle>();

		
		
		//Created instance and assigned to variable
		Vehicle vehicle2 = new Vehicle("Toyota", "Camry", 10000, false);
		//Add vehicle2 to vehicles Array list
		vehicles.add(vehicle2);
		//In line Initialize instance of vehicle without specifying a variable
		vehicles.add(new Vehicle("Honda", "accord", 15000, false));
		vehicles.add(new Vehicle("Jeep", "Wrangler", 25000, true));
	
//		for(Vehicle value : vehicles) {
////			System.out.println(value);
//			System.out.println(value.getMake());
//			System.out.println(value.getModel());
//			System.out.println(value.getPrice());
//			
//		}
		
		printElement(animals);
		printElement(vehicles);
	}

	public static void printElement(List someList) {
		for(int i = 0; i < someList.size(); i++) {
			System.out.println(someList.get(i));
			//If List(Super class of array List and Linked List) is used you can add, remove, etc to both of them
			System.out.println(someList.size());
			
		}
	}
	
}
