package array;

public class SortedArraySum {

	public static void main(String args[]) {
		int arr[] = {10,20,30,40,50};
		int sum =70;
		int firstPointer = 0;
		int lastPointer = arr.length-1;
		while(firstPointer<=lastPointer) {
			int currentSum = arr[firstPointer] + arr[lastPointer];
			if(currentSum == sum) {
				System.out.println("Indexes are "+firstPointer +" and  "+lastPointer);
				break;
			}else if(currentSum<sum) {
				firstPointer += 1;
			}else {
				lastPointer -= 1;
			}
		}
		
	}
}
