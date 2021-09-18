package array;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	
	public static void main(String args[]) {
		int count = 6;
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		List<Integer> currentRow = new ArrayList<Integer>();
		currentRow.add(1);	
		triangle.add(currentRow);
		
		for(int i=1;i<count;i++) {
			List<Integer> prevrow = triangle.get(i-1);
			currentRow = new ArrayList<Integer>();
			currentRow.add(1);
			for(int j=1;j<i;j++) {
				currentRow.add(prevrow.get(j-1)+prevrow.get(j));
			}
			currentRow.add(1);
			triangle.add(currentRow);
		}
		
		
	}

}
