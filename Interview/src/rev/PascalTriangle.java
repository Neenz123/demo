package rev;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	
	public static void main(String args[]) {
		int num = 7;
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		List<Integer> entries = new ArrayList<Integer>();
		entries.add(1);
		triangle.add(entries);
		
		for(int i=1;i<num;i++) {
			entries = new ArrayList<Integer>();
			entries.add(1);
			List<Integer> prevrow = triangle.get(i-1);
			for(int j=1;j<prevrow.size();j++) {
				entries.add(prevrow.get(j)+prevrow.get(j-1));
			}
			entries.add(1);
			triangle.add(entries);
		}
		
		for(List<Integer> row: triangle) {
			for(int val: row) {
				System.out.println(val);
			}
			
			System.out.println("\n");
		}
		
	}

}
