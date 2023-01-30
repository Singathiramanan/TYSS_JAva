package StringProgrames;

import java.util.HashSet;

public class PrintTheUniqueCharacterInAString {

	public static void main(String[] args) {
		String str="karnataka";
		HashSet<Character> set=new HashSet<Character>();
		for(int i=0;i<str.length();i++){
			set.add(str.charAt(i));
		}
		for(Character ch:set){
			int count=0;
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)==ch)
					count++;
			}
			if(count==1)
			System.out.println(ch+" "+count);
		}

	}

}
