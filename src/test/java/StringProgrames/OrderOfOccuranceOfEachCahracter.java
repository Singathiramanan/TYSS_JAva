package StringProgrames;

import java.util.LinkedHashSet;

public class OrderOfOccuranceOfEachCahracter {

	public static void main(String[] args) {
		String s="tester";
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for(int i=0;i<s.length();i++){
			set.add(s.charAt(i));
		}
		for (Character ch : set) {
			for(int i=0;i<s.length();i++){
				if(ch==s.charAt(i)){
					System.out.println(ch+" "+(i+1));
					break;
				}
			}
		}
		System.out.println();
		System.out.println("reverse");
		System.out.println();
		for (Character ch : set) {
			for(int i=s.length()-1;i>=0;i--){
				if(ch==s.charAt(i)){
					System.out.println(ch+" "+(i+1));
					break;
				}
			}
		}

	}

}
