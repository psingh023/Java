package practice.loops;

public class StringsPractice {

	public static void main(String[] args) {

//		String str = "ABCDEFG";
//		String extractedString = str.substring(1,2);
//		
//		System.out.println(extractedString);
////////
		
		
//		String a = "hello";
//		String b = "there";
		
//		if(a == "hello") {
//			//Don't use this STring is a Object it is backed by class
//			//Int, char, boolean this are primitive data types
//			
//			System.out.println("this is wrong");
//		}
//		if(a.equals("hello")) {
//			System.out.println("a is hello");
//		}
//
//		if(b.equalsIgnoreCase("TheRe")) {
//			System.out.println("b is TheRe");
//		}
////////
		
//		String a = "hello";
//		String b = "there";
//		
//		System.out.println(a.charAt(1));
////////
		
	String str = "Hello yogi there yogi there";
	
	int a = str.indexOf("there");
	int b = str.indexOf("there", 12);

	int c = str.indexOf("yogi");
	int d = str.lastIndexOf("yogi");
	
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
		
		
		
		
		
	}

}
