package rev;

import java.util.HashMap;

public class FirstNonRepeating {
	public static void main(String args[]) {
		String str = "aaaabccdef";
		System.out.println(firstNonRpeating(str));
	}
	
	public static char firstNonRpeating(String str) {
		HashMap<Character, Integer> map = new HashMap<>();
		for(char ch:str.toCharArray()) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		
		for(char ch:str.toCharArray()) {
			if(map.get(ch)==1) {
				return ch;
			}
		}
		
		return '_';
	}
}
