package Sony;

import java.util.HashMap;
import java.util.Map.Entry;

public class CharacterRepeted2Times {

	public static void main(String[] args) {
		String str="asdfghadfghasdfg";
		HashMap<Character, Integer> map=new HashMap<>();
		for(int i=0;i<str.length();i++){
			if(!map.containsKey(str.charAt(i))){
				map.put(str.charAt(i), 1);
			}else{
				Integer cnt = map.get(str.charAt(i));
				map.put(str.charAt(i), cnt+1);
			}
		}
		for(Entry<Character, Integer> count:map.entrySet()){
			if(count.getValue()==2){
				System.out.println(count.getKey());
			}
		}

	}

}
