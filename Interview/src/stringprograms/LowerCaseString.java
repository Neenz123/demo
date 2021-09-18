package stringprograms;

public class LowerCaseString {
	
	public static void main(String args[]) {
		String str ="lOVELY";
		String output ="";
		
		for(char c:str.toCharArray()) {
			if(Character.isUpperCase(c)) {
				output = output+ Character.toLowerCase(c);
			}else {
				output =output+c;
			}
		}
		System.out.println(output);
	}

}
