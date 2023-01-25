package Sony;

public class VowelsCount {

	public static void main(String[] args) {
		String[] s={"arun","vijaay","vinay"};
		char[] ch={'a','e','i','o','u'};
		for(int i=0;i<s.length;i++){
			int count=0;
			for(int j=0;j<s[i].length();j++){
				for(int k=0;k<ch.length;k++){
					if(s[i].charAt(j)==ch[k]){
						count++;
					}
				}
			}
			System.out.println(s[i]+" "+count);
		}
	}
}
