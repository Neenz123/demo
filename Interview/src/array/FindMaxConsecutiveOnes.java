package array;

public class FindMaxConsecutiveOnes {
	
	public static void main(String args[]) {
		int[] arr = {1,1,0,1,1,1,1};
		int maxOnes = 0;
		int currentOnes = 0;
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i] == 1) {
				currentOnes += 1;
				maxOnes = Math.max(maxOnes, currentOnes);
			}else {
				currentOnes = 0;
			}
		}
		System.out.println(maxOnes);
	}

}
