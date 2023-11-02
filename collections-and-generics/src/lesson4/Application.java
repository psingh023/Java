package lesson4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Application {

	public static void main(String[] args) {

//		ArrayList<Integer> list1 = new ArrayList<Integer>();
		HashSet<Integer> list1 = new HashSet<Integer>();

		list1.add(12);
		list1.add(43);
		list1.add(15);
		list1.add(67);
		list1.add(43);
		list1.add(10);
		list1.add(10);

		//To Convert the HashSet to the ArrayList
		List<Integer> list = new ArrayList<Integer>(list1);
		
		ArrayList<Integer> newList = new ArrayList<Integer>();
		newList.add(10);
		newList.add(43);
		newList.add(15);
		
		//.addAll- Add the list or the argument
		//.removeAll- Remove the list or the argument
		
		list1.addAll(newList);
		list1.removeAll(newList);
		
		//.clear- Clear/Empty the List
		//list1.clear(list1);
		
		//.contains(12)- Check has value(boolean)
		boolean hasValue = list1.contains(12);
		
		//.isEmpty()- Check if list empty
		//boolean hasValue = list1.isEmpty();
		
		//retainAll - retain the value you want(newList) and delete the other remaining value
		list1.retainAll(newList);
		
		
		
		System.out.println(hasValue);
		System.out.println(list1);
		
		
		////HashSet Sorting(Integer, String and Object)
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(12);
		hashSet.add(43);
		hashSet.add(15);
		hashSet.add(67);
		hashSet.add(43);
		hashSet.add(10);
		
		ArrayList<Integer> myList = new ArrayList<Integer>(hashSet);
		
		Collections.sort(myList);
		
		System.out.println(myList);
		
		/////Object sorting - implement Comparable class to compare the fields for sorting
		HashSet<Employee> hashSet1 = new HashSet<Employee>();
		hashSet1.add(new Employee("Mike", 3500, "Accounting"));
		hashSet1.add(new Employee("Paul", 3000, "Admin"));
		hashSet1.add(new Employee("Peter", 4000, "IT"));
		hashSet1.add(new Employee("Angel",2000, "Maint"));
		
		ArrayList<Employee> myList1 = new ArrayList<Employee>(hashSet1);
		
		Collections.sort(myList1);
		
		System.out.println(myList1);
			
	}
}
