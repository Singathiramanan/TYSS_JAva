package StringProgrames;

public class ReverseStringRecursion {

	public static void main(String[] args) {
		String s1="ramanan";
		String rev = reverse(s1);
		System.out.println(rev);
	}

	static String reverse(String s1) {
		int len=s1.length()-1;
		if(s1==null||s1.length()<=1){
			return s1;
		}else{
			String str=s1.charAt(len)+reverse(s1.substring(0, len));
			return str;
		}
		
	}

}
