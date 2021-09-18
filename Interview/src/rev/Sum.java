package rev;

import java.util.HashMap;

public class Sum {
	public static void main(String args[]) {
		int arr[] = {1,10,20,44,50};
		int sum = 70;
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			int diff = sum- arr[i];
			if(map.containsKey(diff)) {
				System.out.println("index1 " +i +" index2 " + map.get(diff) );
			}else {
				map.put(arr[i], i);
			}
		}
	}
}
