package rev;

public class RemoveAdjacentDulicates {
	public static void main(String args[]) {
		System.out.println(removeDuplicates("abbaca"));
		System.out.println(removeDuplicates("aabbaccd"));
		
		
	}
	
	public static String removeDuplicates(String str) {
		char[] chArr = new char[str.length()];
		int i = 0;
		
		for(int j =0;j<str.length();j++) {
			char currentChar = str.charAt(j);
			if(i>0 && chArr[i-1] == currentChar) {
				i--;
			}else {
				chArr[i] = currentChar;
				i += 1;
			}
		}
				
		return new String(chArr,0,i);
	}
}
