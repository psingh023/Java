package lesson1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Application {

	public static void main(String[] args) {
		//Link List is faster for manipulating while ArrayList faster for retrieving data	

		///ARRAY LIST
				ArrayList words = new ArrayList();
				words.add("hello");
				words.add("there");
//				words.remove(0);
				words.add(10);
				words.add(9);
				
				String item1 = (String) words.get(0);
				int item2 = (int) words.get(2);
//				System.out.println(item1);
//				System.out.println(item2);
				
		// Below is Java 5 using Generic
				//float, string, int, double primitive data type
				//Float, String, Integer, Double complex data type
				ArrayList<String> wordsnew = new ArrayList<String>();
				wordsnew.add("hello");
				wordsnew.add("there");
				wordsnew.add("450");
				

				wordsnew.add(1,"550");
					
				String item_1 = wordsnew.get(2);
				System.out.println(item_1);
				
				
		///LINKED LIST
				LinkedList<Integer> numbers = new LinkedList<Integer>();
				numbers.add(100);
				numbers.add(5911);
				numbers.add(45);
				numbers.add(855);
				
				for(int number : numbers) {
					System.out.println(number);
				}
			}

}
