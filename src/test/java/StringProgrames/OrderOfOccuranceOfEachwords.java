package StringProgrames;

import java.util.LinkedHashSet;

public class OrderOfOccuranceOfEachwords {

	public static void main(String[] args) {
		String s="welcome to bangalore welcome to tyss";
		String[] str = s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<>();
		for(int i=0;i<str.length;i++){
			set.add(str[i]);
		}
		for (String ch : set) {
			for(int i=0;i<s.length();i++){
				if(ch.equals(str[i])){
					System.out.println(ch+" "+(i+1));
					break;
				}
			}
		}

	}

}
