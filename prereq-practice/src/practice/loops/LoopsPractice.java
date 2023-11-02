package practice.loops;

public class LoopsPractice {

	public static void main(String[] args) {
		
		String str = "We have large inventory of things in our warehouse falling in "
				+ "the category:apparel and the slightly "
				+ "more in demand category:makeup along with the category:furniture and _.";

		printCategories(str);

		
	}
	
	public static void printCategories(String string) {
		int a = 0;
//		String categories = null;
		
		while(true){
			int found = string.indexOf("category:", a);
			if(found == -1) {
				break;
			}
			int start = found + 9;
			int end = string.indexOf(" ", start);
			String category = string.substring(start, end);
//			String s= str.substring(found+9);
			System.out.println(category);
			a = end + 1;
//			found = found + 1;
//			categories = categories + category;
			
		}

//		return categories;
	}

//	substring(String start, String end)
//	indexOf(String s, int i)
	
}
