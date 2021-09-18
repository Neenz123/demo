package rev;

public class firstBadVersion {
	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5,6,7,8};
		int low = 0;
		int high = arr.length-1;
		System.out.println(findFirstBadVersion(arr, low, high));
		
	}
	
	public static int findFirstBadVersion(int[] arr, int low, int high) {
		int index = -1;
		if(low<=high) {
			int mid = low + (high - low)/2;
			if(isBadVersion(arr[mid]) && mid == 0) {
				index = arr[mid];
			}else if(isBadVersion(arr[mid]) && !isBadVersion(arr[(mid - 1)])) {
				index = arr[mid];
			}else if(isBadVersion(arr[mid])) {
				index = findFirstBadVersion(arr, low, mid-1);
			}else {
				index = findFirstBadVersion(arr, mid + 1, high);
			}
		}
		return index;
	}
	
	public static boolean isBadVersion(int num) {
		if( num ==3 || num ==4) {
			return true;
		}
		return false;
	}
}
