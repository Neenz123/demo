package array;

public class SingleNumberSolution {

	public static void main(String args[]) {
		int[] arr = {1,2,1,4,2};
		int result = 0;
		//1 XOR 0 = 1
		//1 XOR 2 = 3
		//3 XOR 1 = 2
		//2 XOR 4 = 6
		//6 XOR 2 = 4
		for(int i: arr) {
			result ^= i;
			System.out.println(result);
		}
		
		System.out.println(result);
	}
}
