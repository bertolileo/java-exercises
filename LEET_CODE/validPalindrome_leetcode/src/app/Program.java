package app;

public class Program {

	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		System.out.println(Program.validPalindrome(s));
	}
	
	public static boolean validPalindrome(String s) {
		String fds = s.toLowerCase();
		
		char[] sArray = fds.toCharArray();		
		int aux = 0;
		char[] clone = sArray.clone();
		for (int i = clone.length - 1; i >= 0; i--) {
			sArray[aux] = clone[i];
			aux++;
		}
		
		StringBuilder modString = new StringBuilder();
		
		for (int i = 0; i < sArray.length; i++) {
			if (Character.isLetterOrDigit(sArray[i])) {
				modString.append(sArray[i]);
			}
		}
		String result = modString.toString();
		StringBuilder a = new StringBuilder(result);
		StringBuilder Areversed = a.reverse();
		return result.equals(Areversed.toString());
	}
}
