package mavenproject;

public class Palindrome {
	
	public static void main(String[] args) {
		String value="madam";
		String Reverseorder="";
		char[] rev=value.toCharArray();
		int length=value.length();
		for(int i=length-1;i>=0;i--) {
			Reverseorder=Reverseorder+rev[i];
		}
			if(value.equalsIgnoreCase(Reverseorder)) {
				System.out.println("The Given String is A Palindrome");
		}
		else {
			System.out.println("The Given String is Not A Palindrome");
		}
	}
}
