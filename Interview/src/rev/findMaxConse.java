package rev;

public class findMaxConse {

	public static void main(String args[]) {
		int[] arr = {1,1,0,1,1,1,0,1,1,1,1,1,1};
		int count = 0;
		int maxOnes = 0;
		for(int i = 0; i<arr.length;i++) {
			if(arr[i] == 1) {
				count += 1;
				maxOnes = Math.max(maxOnes, count);
			}else {
				count = 0;
			}
		}
		System.out.println(count);
	}
}
