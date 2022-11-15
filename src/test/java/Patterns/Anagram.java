package Patterns;

public class Anagram {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String s1="fired",s2="fried",a="",b="";
//		char[] as1 = s1.toCharArray();
//		char[] as2 = s2.toCharArray();
//		if(as1.length==as2.length){
//			Arrays.sort(as1);
//			Arrays.sort(as2);
			/*a = new String(as1);
			b = new String(as2);
			if(a.equals(b)){
			System.out.println("It is an anagram");
			}else{
				System.out.println("It is not an anagram");
			}*/
//			int count=0;
//			for(int i=0;i<as1.length;i++){
//				if(as1[i]==as2[i]){
//					count++;
//				}
//			}
//			if(count==as1.length){
//				System.out.println("It is an anagram");
//			}else{
//				System.out.println("It is not an anagram");
//			}
//		}
		/*char[] as1 = s1.toCharArray();
		char[] as2 = s2.toCharArray();
		boolean result=false;
		if(as1.length==as2.length){
			Arrays.sort(as1);
			Arrays.sort(as2);
			result=Arrays.equals(as1, as2);
		}
		if(result==true){
			System.out.println("It is an anagram");
		}else{
			System.out.println("It is not an anagram");
		}*/
		int c1=0,c2=0;
		if(s1.length()==s2.length()){
			for(int i=0;i<s1.length();i++){
				c1+=s1.charAt(i);
				c2+=s2.charAt(i);
			}
			System.out.println(c1+" "+c2);
			if(c1==c2){
				System.out.println("It is an anagram");
			}else{
				System.out.println("It is not an anagram");
			}
		}
		
	}

}
