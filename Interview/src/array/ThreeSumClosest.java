package array;

import java.util.Arrays;

public class ThreeSumClosest {
	
	public static void main(String args[]) {
		int[] arr = {-1, 2, 1, -4};
		int target = 1;
		System.out.println(closestSum(arr, target));
	}
	
	public static int closestSum(int[] arr, int target) {
		int result = arr[0] + arr[1] + arr[2];
		Arrays.sort(arr);
		for(int i =0;i<arr.length;i++) {
			int a_pointer = i+1;
			int b_pointer = arr.length-1;
			
			while(a_pointer<b_pointer) {
				int currentSum = arr[i]+arr[a_pointer]+ arr[b_pointer];
				if(currentSum>target) {
					b_pointer -= 1;
				}else {
					a_pointer += 1;
				}
				if(Math.abs(currentSum-target)<Math.abs(result-target)) {
					result = currentSum;
				}
			}
		}
		
		return result;
	}

}
