package stringprograms;

import java.util.HashSet;

public class LongestSubString {

	public static void main(String args[]) {
		String str = "pwwkewi";
		System.out.println(findSize(str));	
	}
	
	public static int findSize(String str) {
		int size = 0;
		int aPointer = 0;
		int bPointer = 0;
		HashSet<Character> set = new HashSet<>();
		//p
		//pw
		//w
		//wk
		//wke
		//ke
		//kew
		while(bPointer<str.length()) {
			if(!set.contains(str.charAt(bPointer))) {
				set.add(str.charAt(bPointer));
				size = Math.max(size, set.size());
				bPointer += 1;
			}else {
				set.remove(str.charAt(aPointer));
				aPointer += 1;
			}
		}
		return size;
		
	}
}
