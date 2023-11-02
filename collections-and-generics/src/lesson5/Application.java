package lesson5;

//import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Application {

	public static void main(String[] args) {
		//HashMap store the key and value, inserted words/keys order is not maintained
		//LinkedHashMap store the key and value, inserted words/keys order is maintained
		//TreeMap - Sort the key in alphabetical order
		
		TreeMap<String, String> dictionary = new TreeMap<String, String>();
		dictionary.put("Brave", "ready to face and endure danger or pain; showing courage.");
		dictionary.put("Brilliant", "exceptionally clever or talented.");
		dictionary.put("Joy", "a feeling of great pleasure and happiness.");		
		dictionary.put("Confidence", "the feeling or belief that one can rely on someone or something; firm trust.");
		
//		for(String word: dictionary.keySet()) {
//		//	System.out.println(word);
//			System.out.println(dictionary.get(word));
//		}
		for(Map.Entry<String, String> entry: dictionary.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		
	}

}
