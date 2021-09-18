package array;

public class NumberOfIsland {
	
	public static void main(String args[]) {
		int count=0;
		char[][] input = {{'1','1','1','1','0'}, {'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
		for(int i=0;i<input.length;i++) {
			for(int j=0;j<input[i].length;j++) {
				if(input[i][j] == '1') {
					count += 1;
					findNumberOfIsland(input,i,j);
				}
			}
		}
		System.out.println(count);
	}

	private static void findNumberOfIsland(char[][] input, int i, int j) {
		if(i<0||i>input.length||j<0||j>input[i].length||input[i][j]=='0')
			return ;
		input[i][j] = '0';
		findNumberOfIsland(input, i-1, j);
		findNumberOfIsland(input, i+1, j);
		findNumberOfIsland(input, i, j+1);
		findNumberOfIsland(input, i, j-1);
	}

}
