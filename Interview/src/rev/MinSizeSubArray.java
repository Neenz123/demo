package rev;

public class MinSizeSubArray {

	public static void main(String args[]) {
		int[] arr = {2,3,1,2,4,3};
		int sum = 7;
		System.out.println(minSubarray(arr, sum));
	}
	
	public static int minSubarray(int[] arr, int sum) {
		int minSize = Integer.MAX_VALUE;
		int currentSum = 0;
		int left = 0;
		for(int i =0;i<arr.length;i++) {
			currentSum += arr[i];
			
			while(currentSum>=sum) {
				minSize = Math.min(minSize, i+1-left);
				currentSum -= arr[left];
				left += 1;
			}
		}
		
		return (minSize!=Integer.MAX_VALUE) ?minSize:0;
	}
}
