package array;

import java.util.Arrays;

public class SortColorSolution {
	
	public static void main(String args[]) {
		int[] arr = {1,0,2,0,1,0,2};
		sortColor(arr);
		
	}
	
	public static void sortColor(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		int index = 0;
		
		while(index < end && start < end) {
			if(arr[index] == 0) {
				arr[index] = arr[start];
				arr[start] = 0;
				index++;
				start++;
			}else if(arr[index] == 2) {
				arr[index] = arr[end];
				arr[end] = 2;
				end--;
			}else {
				index++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
