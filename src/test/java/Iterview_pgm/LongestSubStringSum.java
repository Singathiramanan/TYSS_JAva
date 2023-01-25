package Iterview_pgm;

public class LongestSubStringSum {

	public static void main(String[] args) {
		String s = "54641";
		int longestString = checkDiv(s);
		System.out.println(longestString);

	}
	public static int checkDiv(String s) {

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) < '0' && s.charAt(i) > '9') {
				return 0;
			}
		}
		char[] ch = s.toCharArray();
		int a[] = new int[ch.length];
		for (int i = 0; i < a.length; i++) {
			a[i] = ch[i] - 48;
		}
		int count = s.length();
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = i; j < a.length; j++) {
				sum = sum + a[j];
			}
			if (sum % 3 == 0) {
				return count;
			}
			count--;
		}
		return -1;

	}
	

}
