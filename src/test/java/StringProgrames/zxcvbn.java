
package StringProgrames;

public class zxcvbn {

	public static void main(String[] args) {
		String s1="test",s2="estt";
		int sum1=0,sum2=0;
//		HashMap<Character, Integer> map1=new HashMap<>();
//		HashMap<Character, Integer> map2=new HashMap<>();
//		int count=1;
//		for (int i = 0; i < s1.length(); i++) {
//			if(map1.containsKey(s1.charAt(i))){
//				Integer value = map1.get(s1.charAt(i));
//				value++;
//				map1.put(s1.charAt(i), value);
//			}else{
//			map1.put(s1.charAt(i), count);
//			}
//				
//		}
//		for (int i = 0; i < s2.length(); i++) {
//			if(map2.containsKey(s2.charAt(i))){
//				Integer value = map2.get(s2.charAt(i));
//				value++;
//				map2.put(s2.charAt(i), value);
//			}else{
//			map2.put(s2.charAt(i), count);
//			}
//				
//		}
//		System.out.println(map1.equals(map2));
		if(s1.length()==s2.length()){
		for (int i = 0; i < s1.length(); i++) {
			sum1=sum1+(int)s1.charAt(i);
			sum2=sum2+s2.charAt(i);
		}
		}
		System.out.println(sum1);
		System.out.println(sum2);
		if(sum1==sum2)
			System.out.println("both same");
		
	}

}
