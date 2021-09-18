package array;

import java.util.TreeMap;

public class HandOfStraights {
	public static void main(String args[]) {
		int[] arr = { 1, 6, 3, 5, 4, 2,9 };
		int w = 2;
		System.out.println(isStraight(arr, w));
	}
	
	public static boolean isStraight(int[] arr, int w) {
		TreeMap<Integer, Integer> myMap = new TreeMap<>();
		for(int i: arr) {
			if(!myMap.containsKey(i)) {
				myMap.put(i, 1);
			}else {
				myMap.put(i, myMap.get(i)+1);
			}
		}
		
		while(myMap.size()>0) {
			int key = myMap.firstKey();
			
			for(int i = key;i<key+w;i++) {
				if(!myMap.containsKey(i))
				{
					return false;
				}else {
					if(myMap.get(i)==1) {
						myMap.remove(i);
					}else {
						myMap.replace(i, myMap.get(i)-1);
					}
				}
			}
		}
		return true;
	}
}
