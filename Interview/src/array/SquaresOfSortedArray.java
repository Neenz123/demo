package array;

import java.util.Arrays;

public class SquaresOfSortedArray {

	public static void main(String args[]) {
		//int[] arr = {-4,-1,0,3,10}; 
		int[] arr = {-1,-4,0,3,5};;
		System.out.println(Arrays.toString(sortedSquares(arr)));
	}
	
	public static int[] sortedSquares(int[] arr) {
		int[] sortedSquare = new int[arr.length];
		int right = 0;
		int counter = 0;
		while(right<arr.length && arr[right]<0) {
			right += 1;
		}
		int left = right-1;
		
		while(left>=0 && right<arr.length) {
			int leftSquare = arr[left]* arr[left];
			int rightSquare = arr[right]* arr[right];
			if(leftSquare>rightSquare) {
				sortedSquare[counter] = rightSquare;
				right += 1;
			}else {
				sortedSquare[counter] = leftSquare;
				left -= 1;
			}
			 counter += 1;
		}
		
		while(left>=0) {
			sortedSquare[counter] = arr[left]* arr[left];
			left -= 1;
			counter += 1;
		}
		while(right<arr.length) {
			sortedSquare[counter] = arr[right]* arr[right];
			right += 1;
			counter += 1;
		}
		
		return sortedSquare;
	}
}
