package Iterview_pgm;

public class FirstSubstringIndex {

	public static void main(String[] args) {
		String s1="rtsgrtrtpabcdrtp";
		String s2="rtp";
		int index=0;
		for(int i=0;i<s1.length();i++){						
			if(s1.charAt(i)==s2.charAt(0)){					
				String sub = s1.substring(i, i+s2.length());
				if(sub.equals(s2)){				
					index=i;
					break;
				}
			}
		}
		System.out.println(index);
	}

}
