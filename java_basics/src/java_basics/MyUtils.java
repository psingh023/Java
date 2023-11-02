package java_basics;

public class MyUtils {


	public static String printSomeJunk(String argument) {
		//Method signature without "void"  
		String someJunk = "String to print " + argument;
		return someJunk;
	}

	public static void printSomeJunk(int argument) {
		System.out.println("int to print " + argument);
	}
	
	public static void sum2Numbers(int firstArg, int secondArg) {
		System.out.println(firstArg + secondArg);
	}
	
	public int add10(int someArgument) {
		//Method signature Without "Static" not accessible directly to class 
		//You need to create a instance of class ->(Object) for method to be called
		//MyUtils myVar;
		//myVar = new MyUtils();
		//myVar.add10(5686);
		int result = someArgument + 10;
		return result;
	}
}
