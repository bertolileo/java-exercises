package app;

public class Program {

	public static void main(String[] args) {
		char[] s = {'H', 'a', 'n', 'n', 'a', 'h'};
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}
		System.out.println();
		Program.reverseString(s);
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}
	}
	
	public static void reverseString(char[] s) {
		int aux = 0;
		char[] clone = s.clone();
		for (int i = s.length - 1; i >= 0; i--) {
			s[aux] = clone[i];
			aux++;
		}
	}

}
