package leetCodeEx;
public class Palindrome {
	public static void main(String[] args) {
	        String input =  "MCMXCIV";
        	int w = 0, x = 0, z = 0;
	        for(int i=0, j=i+1; i < input.length(); i++, j++){
	        	int y = 0;
	            char roman = input.charAt(i);
	            if(roman == 'I'){
	                x=1;
	            } else if(roman == 'V') {
	                x=5;
	            } else if(roman == 'X') {
	                x=10;
	            } else if(roman == 'L') {
	                x=50;
	            } else if(roman == 'C') {
	                x=100;
	            } else if(roman == 'D') {
	                x=500;
	            } else if(roman == 'M') {
	                x=1000;
	            }

	            if (i<(input.length()-1)) {
	            char nextRoman = input.charAt(j);
                if (nextRoman == 'I'){
	                y=1;
	            } else if(nextRoman == 'V') {
	                y=5;
	            } else if(nextRoman == 'X') {
	                y=10;
	            } else if(nextRoman == 'L') {
	                y=50;
	            } else if(nextRoman == 'C') {
	                y=100;
	            } else if(nextRoman == 'D') {
	                y=500;
	            } else if(nextRoman == 'M') {
	                y=1000;
	            } else {
                    y=0;
                }
	            }
                if (x<y){
                    z = y-x;
                    w = w + z;
                    i++;
                    j++;
                } else {
                	w = w + x;
                }
	        }
	        System.out.println(w);

	    
//		int x = 85277258;
//	       if(x<0 || x!=0 && x%10 ==0 ) {
//	    	   System.out.println("not palindrome");
//	    	   return;
//	    	   }
//	        int check=0;
//	        while(x>check){
//	        	System.out.println("\nInside While x: " + x + " check: " + check );
//	            check = check*10 + x%10;
//	            System.out.println("check value after: " + check);
//	            x/=10;
//	            System.out.println("x value after: " + x);
//	        }
//	        System.out.println("----------------");
//	        System.out.println(x + " == " + check + " || " + x + " == " + check/10);
//	        System.out.println(x==check || x==check/10);
	}
}
