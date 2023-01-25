package Iterview_pgm;

import java.util.LinkedList;

public class SpecialSubString {

	public static void main(String[] args) {
		String s = "aBBbtS";
		LinkedList<String> list=new LinkedList<String>();
		for(int i=0;i<s.length();i++){
			for(int j=i+1;j<=s.length();j++){
				list.add(s.substring(i, j));
			}
		}
		int count=s.length();
		for(String str:list){
			if(str.length()%2==0){
				int ch=0;
				for (int i = 0; i < str.length()-1 ; i++) {
					char ch1 = str.charAt(i);
					char ch2 = str.charAt(i + 1);
					if (((ch1 >= 'a' && ch1 <= 'z') && (ch2 >= 'A' && ch2 <= 'Z'))
							|| ((ch1 >= 'A' && ch1 <= 'Z') && (ch2 >= 'a' && ch2 <= 'z'))) {
						ch++;
						i+=1;
					}
				}
				if(str.length()/2==ch){
					count++;
				System.out.println(str);
				}
			}
		}
		System.out.println(count);
	}
}
