package revise;

public class BackSpaceStringReplce {

	public static void main(String args[]) {
		String str1 = "ab#d";
		String str2 = "bac#d";
		
		System.out.println(checkSame(str1, str2));
	}
	
	public static boolean checkSame(String str1, String str2) {
		int pointer1 = str1.length()-1;
		int pointer2 = str2.length()-1;
		int skip1 =0;
		int skip2 =0;
		while(pointer1 >=0 || pointer2 >= 0) {
			
			while(pointer1>=0) {
				if(str1.charAt(pointer1) == '#'){
					skip1 += 1;
					pointer1 -= 1;
				}else if(skip1>0) {
					pointer1 -= 1;
					skip1 -= 1;
				}else {
					break;
				}
			}
			
			while(pointer2>=0) {
				if(str2.charAt(pointer2) == '#'){
					skip2 += 1;
					pointer2 -= 1;
				}else if(skip2>0) {
					pointer2 -= 1;
					skip2 -= 1;
				}else {
					break;
				}
			}
			
			if(pointer1>=0 && pointer2>=0 && str1.charAt(pointer1)!=str2.charAt(pointer2)) {
				return false;
			}
			if((pointer1>=0) != (pointer2>=0)) {
				return false;
			}
			
			pointer1 -= 1;
			pointer2 -= 1;
			
		}
		return true;
	}
}
