package stringprograms;

public class RemoveAdjacentDuplicates {
	public static void main(String args[]) {
		System.out.println(removeDuplicates("abbaca"));
		System.out.println(removeDuplicates("aabbaccd"));
		
		
	}
	
	public static String removeDuplicates(String str) {
		
		char[] stack = new char[str.length()];
		int i =0;
		
		for(int j=0;j<str.length();j++) {
			char currentChar = str.charAt(j); 
			if(i>0 && stack[i-1] == currentChar) {
				i--;
			}else {
				stack[i] =  currentChar;
				i += 1;
			}
		}
		return new String(stack, 0, i);
	}
}
