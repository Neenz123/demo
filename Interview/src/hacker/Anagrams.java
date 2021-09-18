package hacker;

public class Anagrams {
	public static void main(String args[]) {
		System.out.println(isAnagram("CAT", "ACS"));
	}
	
	public static boolean isAnagram(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();
		
		int[] afrequency = new int[26];
		for(int i =0;i<a.length();i++){
			char char1 = a.charAt(i);
			int index1 = char1- 'a';
			afrequency[index1]++;
		}
		
		for(int i =0;i<b.length();i++){
			char char1 = b.charAt(i);
			int index1 = char1- 'a';
			afrequency[index1]--;
		}
		
		for(int i: afrequency) {
			if(i!=0) {
				return false;
			}
		}
		return true;
	}
}
