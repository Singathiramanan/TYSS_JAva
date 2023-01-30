package StringProgrames;

import java.util.LinkedHashSet;

public class NumberOfAccuranceInEachCharOfString {

	public static void main(String[] args) {
		String s="karnataka";
//		int count=1;
//		LinkedHashMap<Character, Integer> map=new LinkedHashMap<>();
//		for (int i = 0; i < s.length(); i++) {
//			if(!map.containsKey(s.charAt(i))){
//				map.put(s.charAt(i), count);
//			}else{
//			
//			Integer value = map.get(s.charAt(i));
//			value++;
//			map.put(s.charAt(i), value);
//			}
//		}
//		//System.out.println(map);
//		for(Entry<Character, Integer> e:map.entrySet()){
//				System.out.println(e.getKey()+" "+e.getValue());			
//		}
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++){
			set.add(s.charAt(i));
		}
		for(Character ch:set){
			int count=0;
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)==ch)
					count++;
			}
			System.out.println(ch+" "+count);
		}
	}

}
