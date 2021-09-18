package misc;

import java.util.HashSet;

public class UniqueEmail {
	
	public static void main(String args[]) {
		String[] emails = {"neena.valooran@gmail.com", "neenavalooran@gmail.com","alice+aa@gmail.com","alice@gmail.com"};
		HashSet<String> uniqueEmails = new HashSet<>();
		
		for(String email: emails) {
			int pos = email.indexOf("@");
			String localName = email.substring(0, pos);
			String domainName = email.substring(pos);
			if(localName.contains("+")) {
				int plusPos = localName.indexOf("+");
				localName = localName.substring(0, plusPos);
			}
			localName = localName.replaceAll("\\.", "");
			String correctedEmail = localName + domainName;
			uniqueEmails.add(correctedEmail);
		}
		
		System.out.println(uniqueEmails.size());
		
	}

}
