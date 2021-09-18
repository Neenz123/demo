package rev;

import java.util.HashSet;

public class LongestSeq {

	public static void main(String args[]) {
		int[] arr = { 1, 2, 3, 5, 6, 7, 8, 9 };
		System.out.println(longestSeq(arr));
	}

	public static int longestSeq(int[] arr) {
		int longestSeq = 0;
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}

		for (int element : arr) {
			if (!set.contains(element - 1)) {
				int seq = 1;
				while (set.contains(element + 1)) {
					seq += 1;
					element += 1;
					longestSeq = Math.max(longestSeq, seq);
				}
			}
		}
		return longestSeq;
	}

}
