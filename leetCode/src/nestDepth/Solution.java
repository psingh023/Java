package nestDepth;

public class Solution {

	public static void main(String[] args) {
		String s = "(1+(2*3)+((8)/4))+1";
//		char vps = 0;
		int maxDep = 0;
		int leftDep = 0;
        for(int i=0; i<s.length();i++) {
			char c = s.charAt(i);
//			System.out.println(c);
			
			if(c == '(') {
				leftDep++;
				maxDep++;
			} 
//			else if((dep == 3) && (c == ')')) {
//				return vps;
//			}
			else if (c == ')') {
				if (leftDep > 0)
				{
					leftDep--;
				}
			} 
//			else {
//				vps = (char) (vps + c);
//			}
		}
        return maxDep - leftDep;
	}

}
