package array;

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
		boolean isVisited = true;
		boolean[] visited = new boolean[rooms.size()];
		Stack<Integer> keys = new Stack<>();
		visited[0] = true;
		keys.add(0);
		
		while(!keys.isEmpty()) {
			int key = keys.pop();
			for(int k: rooms.get(key)) {
				if(!visited[k]) {
					visited[k] = true;
					keys.add(k);
				}
			}
		}
		
		for(boolean val: visited) {
			if(val!= true) {
				isVisited = false;
				break;
			}
		}
		return isVisited;
		
	}
}
