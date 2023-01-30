package StringProgrames;

import java.util.LinkedHashSet;

public class CountTheWordsInGivenString {

	public static void main(String[] args) {
		String s="welcome to bangalore welcome to tyss";
		String[] str = s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++){
			set.add(str[i]);
		}
		for(String s1:set){
			int count=0;
			for(int i=0;i<str.length;i++){
				if(str[i].equals(s1))
					count++;
			}
			System.out.println(s1+" "+count);
		}

	}

}
