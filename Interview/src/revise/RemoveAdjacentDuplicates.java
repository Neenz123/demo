package revise;

public class RemoveAdjacentDuplicates {
	public static void main(String args[]) {
		String str = "aabbaccd";
		char[] charArr = new char[str.length()];
		int j =0;
		
		for(int i=0;i<str.length();i++){
			if(j>0 && str.charAt(i) == charArr[j-1]) {
				j--;
			}else {
				charArr[j] = str.charAt(i);
				j++;
			}
		}
		System.out.println(new String(charArr,0,j));
	}
}
