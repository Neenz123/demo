package misc;

public class PalindromeNumber {
	
	public static void main(String args[]) {
		int num = 12211;
		System.out.println(isPalindrome(num));	
	}
	
	public static boolean isPalindrome(int num) {
		int no = num;
		int revNum =0;
		if(num == 0) {
			return true;
		}
		if(num<0) {
			return false;
		}
		while(num>0) {
			revNum = (revNum*10) + num%10;
			num = num/10;
		}
		if(no == revNum) {
			return true;
		}
		return false;
	}

}
