package array;

import java.util.HashSet;

public class LongestSequence {
	
	public static void main(String args[]) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(findLongestSequnce(arr));
	}
	
	public static int findLongestSequnce(int[] arr) {
		int longestSequnce = 0;
		HashSet<Integer> set = new HashSet<>();
		for(int num : arr) {
			set.add(num);
		}
		
		for(int element : arr) {
			if(!set.contains(element-1)) {
				int count = 1;
				while(set.contains(element+1)) {
					count += 1;
					element = element + 1;
					longestSequnce = Math.max(count, longestSequnce);
				}
			}
		}
		return longestSequnce;
	}

}
