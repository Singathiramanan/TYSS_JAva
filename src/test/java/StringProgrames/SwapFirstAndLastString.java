package StringProgrames;

import java.util.ArrayList;
import java.util.Collections;

public class SwapFirstAndLastString {

	public static void main(String[] args) {
		String s="this is test yentra";
		String[] str = s.split(" ");
		ArrayList<String> list=new ArrayList<>();
		for(int i=0;i<str.length;i++){
			list.add(str[i]);
		}
		Collections.swap(list, 0, list.size()-1);
		for(String st:list){
			System.out.print(st+" ");
		}
//		String temp=str[0];
//		str[0]=str[str.length-1];
//		str[str.length-1]=temp;
//		for(int i=0;i<str.length;i++){
//			System.out.print(str[i]+" ");
//		}
		
		

	}

}
