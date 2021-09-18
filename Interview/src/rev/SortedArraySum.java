package rev;

public class SortedArraySum {
	public static void main(String args[]) {
		int arr[] = { 10, 20, 30, 40, 50 };
		int sum = 70;
		int pointer1 = 0;
		int pointer2 = arr.length-1;
		while(pointer1<=pointer2) {
			int currentsum = arr[pointer1] + arr[pointer2];
			if(currentsum<sum) {
				pointer1++;
			}else if(currentsum>sum) {
				pointer2--;
			}else {
				System.out.println(arr[pointer1]);
				System.out.println(arr[pointer2]);
				break;
			}
		}
	}
}
