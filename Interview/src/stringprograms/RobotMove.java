package stringprograms;

public class RobotMove {
	
	public static void main(String args[]) {
		
		System.out.println(validMove("UD"));
		System.out.println(validMove("UU"));
		System.out.println(validMove("LLRR"));

	}
	
	public static boolean validMove(String str) {
		boolean isValid = false;
		int x = 0;
		int y = 0;
		
		for(char c: str.toCharArray()) {
			if(c == 'R') {
				x +=1;
			}
			if(c == 'L') {
				x -= 1;
			}
			if(c == 'U') {
				y += 1;
			}
			if(c == 'D') {
				y -= 1;
			}
			
		}
		
		if(x ==0 && y ==0) {
			isValid = true;
		}
		return isValid;
	}

}
