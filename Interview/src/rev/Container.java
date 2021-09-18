package rev;

public class Container {
	public static void main(String args[]) {
		int[] arr  = {1,8,6,2,5,4,8,3,7};
		System.out.println(findMaxArea(arr));	
	}
	
	public static int findMaxArea(int[] arr) {
		int maxAreas = 0;
		int left = 0;
		int right = arr.length-1;
		while(left<right) {
			if(arr[left]<=arr[right]) {
				maxAreas = Math.max(maxAreas, (right - left) * arr[left]);
				left += 1;
			}else if(arr[left]>arr[right]) {
				maxAreas = Math.max(maxAreas, (right-left) * arr[right]);
				right -= 1;
			}
			
		}
		return maxAreas;
	}
}
