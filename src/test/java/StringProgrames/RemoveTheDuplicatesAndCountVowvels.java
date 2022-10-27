package StringProgrames;

import java.util.LinkedHashSet;

public class RemoveTheDuplicatesAndCountVowvels {

	public static void main(String[] args) {
		int count=0;
	/*	String str="bangaluru".toLowerCase();
		char[] ch = str.toCharArray();
		char[] a={'a','e','i','o','u'};
		
		String s1="";
		for(int i=0;i<str.length();i++){
			for(int j=0;j<a.length;j++){
//				if(ch[i]==a[j])
//					count++;
				if(!s1.contains(Character.toString(ch[i])))
					s1=s1+ch[i];
				
			}
		}
		System.out.println(count);
		System.out.println(s1);*/
		String s="india";
		String s1 = s.toLowerCase();
		char[] ch= s1.toCharArray();
		LinkedHashSet<Character> cha=new LinkedHashSet<>();
		for(int i=0;i<ch.length;i++){
			cha.add(ch[i]);			
		}
		System.out.println(cha);
		for(Character c:cha){
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
				count++;
			System.out.println(c+" "+count);
			}
		}
		

	}

}
