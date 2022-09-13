package StringProgrames;

public class StringFunctions {

	public static void main(String[] args) {
		String s1=" hi",s2="welcome",s3="";
		System.out.println(String.join(s1, s2));
		System.out.println(s1.concat(s2));
		System.out.println(s3.isEmpty());
		System.out.println(s1.trim());
		System.out.println(s2.substring(1, 3));
		System.out.println(s2.replace("e", "q"));
		System.out.println(s1.startsWith(" "));
		System.out.println(s1.endsWith("i"));
		String s="welcome to bangalore";
		String[] str = s.split(" ");
		for(int i=0;i<s.length();i++){
			System.out.println(str[i]);}
		System.out.println(s1.indexOf('c'));

	}

}
