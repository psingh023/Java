package client;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class Application {

	public static void main(String[] args) {
		Container<Integer, String> container = new Container<>(12, "Hello");
		int val1 = container.getItem1();
		String val2 = container.getItem2();
		
		//Generic you can pass any data type to generic container
		Container<Double, Integer> container2 = new Container<>(18.22, 354);
	
		System.out.println(val1);
		System.out.println(val2);
		
		//Define new Set then add value
		Set<String> mySet1 = new HashSet<String>();
		mySet1.add("first");
		mySet1.add("second");
		mySet1.add("whatever");
		
		Set<String> mySet2 = new HashSet<String>();
		mySet2.add("first");
		mySet2.add("second");
		mySet2.add("Computer");
		
		Set<String> resultSet = union(mySet1, mySet2);
		
		Iterator<String> itr = resultSet.iterator();
		while(itr.hasNext()) {
			String var = itr.next();
			System.out.println(var);
		}
		
	}
	//<E> Element
	//<T> Types
	//<K> Hash Map - Key
	//<V> Hash Map - Values
	
	public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
		Set<E> result = new HashSet<E>(set1);
		result.addAll(set2);
		return result;
	}
}
