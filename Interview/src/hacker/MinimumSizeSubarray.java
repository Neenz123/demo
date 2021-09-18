package hacker;

public class MinimumSizeSubarray {

	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5,2};
		int sum = 7;
		System.out.println(findSize(arr, sum));
	}
	
	public static int findSize(int[] arr, int sum) {
		int minSum = Integer.MAX_VALUE;
		int left =0;
		int currentSum = 0;
		for(int i =0;i<arr.length;i++) {
			currentSum += arr[i];
			
			while(currentSum>=sum) {
				minSum = Math.min(minSum, i+1-left);
				currentSum -= arr[left];
				left++;
			}
		}
		return minSum;
	}
}
