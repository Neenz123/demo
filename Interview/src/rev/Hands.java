package rev;

import java.util.TreeMap;

public class Hands {

	public static void main(String args[]) {
		int arr[] = {1,2,3,6,2,3,4,7,10};
		int w = 3;
		System.out.println(isStraight(arr, w));
	}
	
	public static boolean isStraight(int[] arr, int w) {
		TreeMap<Integer, Integer> map = new TreeMap<>();
		for(int i = 0; i<arr.length; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		
		while(map.size()>0) {
			int key = map.firstKey();
			
			for(int i = key;i<key+w;i++) {
				if(!map.containsKey(i)) {
					return false;
				}else {
					if(map.get(i) >1) {
						map.replace(i, map.get(i)-1);
					}else {
						map.remove(i);
					}
				}
			}
		}
		return true;
	}
}
