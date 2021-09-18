package array;

import java.util.HashMap;

public class Sum {
	
	public static void main(String args[]) {
		int arr[] = {1,10,20,44,50};
		int sum = 70;
		HashMap<Integer, Integer> myMap = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			int diff = sum-arr[i];
			if(myMap.containsKey(diff)) {
				System.out.println("Indexes are " +i +" and " +myMap.get(diff));
			}else {
				myMap.put(arr[i], i);
			}
		}
		
	}

}
