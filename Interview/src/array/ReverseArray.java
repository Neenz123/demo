package array;

import java.util.Arrays;

public class ReverseArray {
	
	public static void main(String args[]) {
		char[]  arr = {'a','b', 'c', 'd'};
		int pointer1 = 0;
		int pointer2 = arr.length-1;
		
		while(pointer1 < pointer2) {
			char temp = arr[pointer1];
			arr[pointer1] = arr[pointer2];
			arr[pointer2] = temp;
			pointer1 +=1;
			pointer2 -= 1;
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
