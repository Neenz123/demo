package array;

public class FirstBadVersion {

	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5,6,7,8};
		int low = 0;
		int high = arr.length-1;
		System.out.println(findFirstBadVersion(arr, low, high));
		
	}
	
	public static int findFirstBadVersion(int[] arr, int low, int high) {
		int val = -1;
		if(low<=high) {
			int mid = low + (high-low)/2;
			if(isBadVersion(arr[mid]) && mid==0) {
				val = arr[mid];
			}
			else if(isBadVersion(arr[mid]) && !isBadVersion(arr[mid-1])) {
				val = arr[mid];
			}
			else if(isBadVersion(arr[mid])) {
				val= findFirstBadVersion(arr, low, mid-1);
			}else {
				val = findFirstBadVersion(arr, mid+1, high);
			}
		}
		return val;
	}
	
	public static boolean isBadVersion(int num) {
		if(num ==6|| num==7||num==8 || num ==5 ||num ==1 || num ==2 || num ==3 || num ==4) {
			return true;
		}
		return false;
	}
}
