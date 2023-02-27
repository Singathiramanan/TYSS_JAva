package Assignment;

public class sdfghjk {

	public static void main(String[] args) {
		
		String s1="malayalam",s2="al";
		int count=0;
		for(int i=0;i<s1.length()-s2.length();i++){
			if(s1.charAt(i)==s2.charAt(0)){
				String str = s1.substring(i, i+s2.length());
				if(str.equals(s2)){
					count++;
				}
			}
		}
		System.out.println(count);
		for(int i=0;i<s1.length()-1;i++){
			
		}
		
	}

}
