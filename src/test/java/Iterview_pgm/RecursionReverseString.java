package Iterview_pgm;

public class RecursionReverseString {

	public static void main(String[] args) {
		String s="venkataramanan";
		System.out.println(s.substring(5));
		System.out.println(s.substring(3, 8));
		String rev=Reverse(s);
		System.out.println(rev);
	}

	public static String Reverse(String s) {
		String rev="";
		int len = s.length();
		if((len)>1)
		rev=rev+(s.charAt(len-1)+(Reverse(s.substring(0,len-1))));
		else{
			rev=rev+s.charAt(len-1);
		}
		return rev;
	}

}
