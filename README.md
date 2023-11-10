# JAVA
| JAVA | COLLECTIONS |


Parent - **List**

Child  - ArrayList 

Child  - LinkList


Parent - **Set**

Child  - HashSet

Child  - LinkedHashSet

Child  - TreeSet


Parent - **Map**

Child  - HashMap<K,V>       - No Duplicates, Not Preserve insert order

Child  - LinkedHashMap<K,V> - No Duplicates, Preserve insert order

Child  - TreeMap<K,V>       - No Duplicates(Keep last value definition same key), Preserve natural order(ascending and descending)

```java
HashMap<String, String> dictionary = new HashMap<String, String>();
dictionary.put("Brave", "Brave meaning here");

for(String word: dictionary.keySet()){
    // this only print key 
	System.out.println(dictionary.get(word));
	
}

for (Map.Entry<String, String> entry: dictionary.entrySet()){
	// this only print key and value
	System.out.println(entry.getKey());
	System.out.println(entry.getValue());
}
```
## **GENERICS**
```java
 Container<Integer, String> container = new Container<Integer, String>(12, "Hello");
~ Container<Integer, String> container = new Container<>(12, "Hello");
 	int val1 = container.getItem1();
 	String val2 = container.getItem2();

Public class Container<i1, i2> {
	// i1 and i2 used as generic type
	i1 item1;  
	i2 item2;
 	public Container(i1 item1, i2 item2){
 		this.item1 = item1; ...
 	}
}

Set<String> mySet1 = newHashSet<String>();
mySet1.add("first");
mySet1.add("second");
mySet1.add("whatever");

Set<String> mySet2 = newHashSet<String>();
mySet1.add("first");
mySet1.add("second");
mySet1.add("computer");

Set<String> resultSet = union(mySet1, mySet2);

Iterator<String> itr = resultSet.iterator();
while(itr.hasNext()){
	String var = itr.nextValue();
	System.outprintln(var);
}

public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
	Set<E> result = new HashSet<>(set1);
	result.addAll(set2);
	return result;
}


public static <E- *'Generic type parameter defined'*> Set<E - *'Return Data Type'*> union(Set<E - *'Type Parameter'*> set1, Set<E> set2) {
	Set<E> result = new HashSet<>(set1);
	result.addAll(set2);
	return result;
}
```
