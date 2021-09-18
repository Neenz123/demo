package array;

import java.util.HashSet;

public class Duplicates {
	
	public static void main(String args[]) {
		int arr[] = {1,2,2,3,4,4,6,7,8,7};
		HashSet<Integer> mySet = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(mySet.contains(arr[i])) {
				System.out.println(arr[i]);
			}else {
				mySet.add(arr[i]);
			}
		}
		
		
		System.out.println(findDuplicate(arr));
	}
	
	public static int findDuplicate(int[] arr) {
		for(int i = 0;i<arr.length; i++) {
			if(arr[Math.abs(arr[i] - 1)]<0) {
				return arr[i];
			}else {
				arr[Math.abs(arr[i]-1)] = -arr[Math.abs(arr[i]-1)];
			}
		}
		return -1;
	}
}
