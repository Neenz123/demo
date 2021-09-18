package rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RoomAndKey {
	public static void main(String args[]) {
		List<Integer> room0 = new ArrayList<>();
		room0.add(1);
		
		List<Integer> room1 = new ArrayList<>();
		room1.add(2);
		
		List<Integer> room2 = new ArrayList<>();
		room2.add(3);
		
		List<Integer> room3 = new ArrayList<>();
		
		List<List<Integer>> rooms = new ArrayList<List<Integer>>();
		rooms.add(room0);
		rooms.add(room1);
		rooms.add(room2);
		rooms.add(room3);
		
		System.out.println(isAllVisisted(rooms));
	}
	
	public static boolean isAllVisisted(List<List<Integer>> rooms) {
		boolean[] isAllVisited = new boolean[rooms.size()];
		Stack<Integer> stack = new Stack<>();
		isAllVisited[0] = true;
		stack.add(0);
		
		while(!stack.isEmpty()) {
			int key = stack.pop();
			List<Integer> keys = rooms.get(key);
			for(int i: keys) {
				if(!isAllVisited[i]) {
					isAllVisited[i] = true;
					stack.add(i);
				}
			}
		}
		
		for(boolean val: isAllVisited) {
			if(!val) {
				return false;
			}
		}
		
		return true;
	}
}
