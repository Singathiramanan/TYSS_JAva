package Iterview_pgm;

import java.util.HashMap;
import java.util.Map.Entry;

public class UniquesubString {

	public static void main(String[] args) {
		String s="aabcba";
		HashMap<String, Integer> map=new HashMap<>();
		for(int i=0;i<s.length();i++){
			for(int j=i+1;j<=s.length();j++){
				String str = s.substring(i, j);
				if(!map.containsKey(str)){
					map.put(str, 1);
				}else{
					Integer cnt = map.get(str);
					map.put(str, cnt+1);
				}
			}
		}
		for(Entry<String,Integer> entry:map.entrySet()){
			if(entry.getValue()==1)
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}

	}

}
