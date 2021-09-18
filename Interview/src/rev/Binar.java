package rev;

public class Binar {
	
	public static void main(String args[]) {
		int[] arr = {1,3,5,7,9,20,23};
		int num = 20;
		int left = 0;
		int right = arr.length-1; 
		System.out.println(search(arr, num, left, right));
	}
	
	public static int search(int[] arr, int num, int left, int right) {
		int index = -1;
		if(left<=right) {
			int mid = left + (right - left)/2;
			if(arr[mid] == num) {
				index = mid;
			}else if(arr[mid]<num) {
				index = search(arr, num, mid+1, right);
			}else {
				index = search(arr, num, left, mid-1);
			}
		}
		return index;
	}

}
