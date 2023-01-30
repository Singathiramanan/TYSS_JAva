package StringProgrames;

import java.util.HashSet;

public class PrintTheCharBySeparate {

	public static void main(String[] args) {
		String s="abbabcbca";
		HashSet<Character> set=new HashSet<Character>();
		for(int i=0;i<s.length();i++){
			set.add(s.charAt(i));
		}
		for(Character n:set){	
			for(int i=0;i<s.length();i++){
				if(n==s.charAt(i)){
					System.out.print(n);
					
				}		
			}
		}
	}
}
