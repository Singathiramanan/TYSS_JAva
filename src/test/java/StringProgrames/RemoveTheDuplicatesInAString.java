package StringProgrames;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class RemoveTheDuplicatesInAString {

	public static void main(String[] args) {
		String s="tester";
//		String s1 = s.toUpperCase();
//		char[] ch= s1.toCharArray();
//		LinkedHashSet<Character> cha=new LinkedHashSet<>();
//		for(int i=0;i<ch.length;i++){
//			cha.add(ch[i]);			
//		}
//		System.out.println(cha);
		
		int count=1;
		LinkedHashMap<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if(map.containsKey(s.charAt(i))){
				Integer value = map.get(s.charAt(i));
				value++;
				map.put(s.charAt(i), value);
			}else{
			map.put(s.charAt(i), count);
			}
			
		}
		System.out.println(map);
		for(Entry<Character, Integer> e:map.entrySet()){
			if(map.get(e.getKey())>1){
				System.out.println(e.getKey()+" "+e.getValue());
			}
			
		}		
		
		/*String remove="";
		String duplicate="";
		int count=0;
		for(int i=0;i<s.length();i++){
				if(!remove.contains(Character.toString(s.charAt(i)))){
					remove=remove+s.charAt(i);
				}else{
					duplicate=duplicate+s.charAt(i);
					count++;
				}
		}
		System.out.println(remove);
		System.out.println(duplicate);
		System.out.println(count);*/

	}

}
