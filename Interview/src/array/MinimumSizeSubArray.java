package array;

public class MinimumSizeSubArray {

	public static void main(String args[]) {
		int[] arr = {2,3,1,2,4,3};
		int sum = 7;
		System.out.println(minSubarray(arr, sum));
	}
	
	public static int minSubarray(int[] arr, int sum) {
		int result = Integer.MAX_VALUE;
		int left = 0;
		int currentSum = 0;
		
		for(int i =0;i<arr.length;i++) {
			currentSum += arr[i];
			
			while(currentSum>=sum) {
				result = Math.min(i+1-left, result);
				currentSum -= arr[left];
				left++;
			}
		}
		
		return (result != Integer.MAX_VALUE)? result : 0;
	}
}
