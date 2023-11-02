package javaSampleB;

public class leftandrightsum {

	public static void main(String[] args) {

		int[] nums = new int[] { 10, 4, 8, 3 };
		int n = nums.length;
		int prefixSum[] = new int[n];
		int suffixSum[] = new int[n];
		int answer[] = new int[n];
		int answer2 = 0;
			
		for(int num : nums) {
			answer2 += num;
		}
		System.out.println("answer2" + answer2);
		
		if ((n == 1) || (n == 0)) {
			answer[0] = 0;
		} else {
			prefixSum[0] = 0;
			suffixSum[n - 1] = 0;
			for (int i = 1; i < n; i++) {
				prefixSum[i] = nums[i - 1] + prefixSum[i - 1];
			}

			for (int i = n - 2; i >= 0; i--) {
				suffixSum[i] = nums[i + 1] + suffixSum[i + 1];
			}

			for (int i = 0; i < n; i++) {
				answer[i] = prefixSum[i] - suffixSum[i];
			}

		
			for (int i = 0; i < n; i++) {
				System.out.println("Preffix" + prefixSum[i]);
			}

			for (int i = 0; i < n; i++) {
				System.out.println("Suffix" + suffixSum[i]);
			}

			for (int i = 0; i < n; i++) {
				System.out.println("answer[i]" + answer[i]);
			}

		}
	}


}
