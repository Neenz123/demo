package stringprograms;

public class ValidPalindrome {
	
	public static void main(String args[]) {
		String str = "As, dd, sa";
		String str1 = "";
		boolean isValid = true;
		
		for(char c: str.toCharArray()) {
			if(Character.isLetterOrDigit(c)) {
				str1= str1 + c;
			}
		}
		
		int pointer1 = 0;
		int pointer2 = str1.length()-1;
		str1 = str1.toLowerCase();
		while(pointer1<=pointer2) {
			if(str1.charAt(pointer1) != str1.charAt(pointer2)) {
				isValid = false;
				break;
			}
			
			pointer1 += 1;
			pointer2 -= 1;
		}
		System.out.println(isValid);
		
	}

}
