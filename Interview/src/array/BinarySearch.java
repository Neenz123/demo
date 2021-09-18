package array;

public class BinarySearch {
	
	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5,6,7};
		int low =0;
		int high = arr.length-1;
		int num = 3;
		System.out.println(binarySearch(arr,low,high,num));
	}
	
	public static int binarySearch(int[] arr, int low, int high, int num) {
		int index = -1;
		if(low<=high) {
			int mid = low +(high-low)/2;
			if(arr[mid] == num) {
				index = mid;
			}else if(arr[mid]>num) {
				index = binarySearch(arr, low, mid-1, num);
			}else {
				index = binarySearch(arr, mid+1, high, num);
			}
		}
		return index;
	}

}
