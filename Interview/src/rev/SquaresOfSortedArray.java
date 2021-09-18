package rev;

import java.util.Arrays;

public class SquaresOfSortedArray {
	public static void main(String args[]) {
		//int[] arr = {-4,-1,0,3,10}; 
		int[] arr = {-1,-4,0,3,5};;
		System.out.println(Arrays.toString(sortedSquares(arr)));
	}
	
	public static int[] sortedSquares(int[] arr) {
		int[] sortedArray = new int[arr.length];
		int left = 0;
		
		while(arr[left] < 0) {
			left += 1;
		}
		
		int right = left+1;
		int index = 0;
		while(left>=0 && right<arr.length) {
			int leftSquare = arr[left] * arr[left];
			int rightSquare = arr[right] * arr[right];
			if(leftSquare>rightSquare) {
				sortedArray[index] = rightSquare;
				index++;
				right++;
			}else {
				sortedArray[index] = leftSquare;
				index++;
				left--;
			}
		}
		
		while(left>0) {
			sortedArray[index] = arr[left] * arr[left];
			index++;
			left--;
		}
		while(right<arr.length) {
			sortedArray[index] = arr[right] * arr[right];
			index++;
			right++;
		}
		return sortedArray;
	}
}
