package shipNumInRectangle;

public class Solution {

	public static void main(String[] args) {
		int[][] sea = {{1,1},{2,2},{3,3},{5,5}};
		int[] topRight = {4,4};
		int[] bottomLeft = {0,0};
		
		Sea.hasShips(topRight, bottomLeft){
			
		}
		
		for(int i=0; i<sea.length; i++) {
			for(int j=0; j<2; j++) {
				if((sea[i][j]<topRight[j])&&(sea[i][j]>bottomLeft[j])) {
					System.out.println(sea[i][j]);
				}
			}
		}
			
	}

}
