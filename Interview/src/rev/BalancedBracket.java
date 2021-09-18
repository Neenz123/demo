package rev;

import java.util.Stack;

public class BalancedBracket {

	
	public static void main(String args[]) {
		String str = "abcjdebfdnnjbddcefe";
		System.out.println(isBalanced(str));
		
	}
	
	public static String isBalanced(String str) {
		Stack<Character> stack = new Stack<>();
		for(char ch: str.toCharArray()) {
			if(ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
			}else {
				if(ch == ')' && stack.pop() != '(') {
					return "NO";
				}else if(ch == ']' && stack.pop() != '[') {
					return "NO";
				}else if(ch == '}' && stack.pop() != '{') {
					return "NO";
				}
			}
		}
		
		if(stack.isEmpty()) {
			return "YES";
		}else{
			return "NO";
		}
	}
}
