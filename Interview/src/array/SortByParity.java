package array;

public class SortByParity {

	public static void main(String args[]) {
		int[] arr = {1,2,4,5,7};
		int i = 0;
		int j = arr.length-1;
		
		while(i<j) {
			if(arr[i]%2>arr[j]%2) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
			if(arr[i]%2 == 0) i++;
			if(arr[j]%2 == 1) j--;
		}
		
		for(int ele: arr) {
			System.out.println(ele);
		}
	}
}
