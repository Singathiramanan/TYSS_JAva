package StringProgrames;

public class ReverseStringRecursion {

	public static void main(String[] args) {
		String s1="venkat";
		String rev = reverse(s1);
		System.out.println(rev);
	}

	static String reverse(String s1) {
		if(s1==null||s1.length()<=1){
			return s1;
		}else{
			String str=s1.charAt(s1.length()-1)+reverse(s1.substring(0, s1.length()-1));
			return str;
		}
		
	}

}
