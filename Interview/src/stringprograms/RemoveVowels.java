package stringprograms;

public class RemoveVowels {

	public static void main(String args[]) {
		String str = "neenaAA";
		System.out.println(str.replaceAll("[aeiouAEIOU]", ""));
	}
}
