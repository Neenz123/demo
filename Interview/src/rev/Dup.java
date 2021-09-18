package rev;

import java.util.HashSet;

public class Dup {

	public static void main(String args[]) {
		int[] arr = {1,2,3,4,5,6,6,7,8,8};
		printDup(arr);
	}
	
	public static void printDup(int[] arr) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i =0;i<arr.length;i++) {
			if(set.contains(arr[i])) {
				System.out.println(arr[i]);
			}else {
				set.add(arr[i]);
			}
		}
	}
}
