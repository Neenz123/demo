package array;

public class LemonadeBill {

	public static void main(String args[]) {
		int[] arr = {5,10,20};
		int five = 0;
		int ten = 0;
		
		for(int num: arr) {
			if(num == 5) {
				five++;
			}else if(num == 10) {
				ten++;
				five--;
			}else {
				if(ten>0) {
					ten --;
					five --;
				}else {
					five -= 3;
				}
			}
				
		}
		if(five<0) {
			System.out.println("false");
		}else {
			System.out.println("true");
		}
		
	}
}
