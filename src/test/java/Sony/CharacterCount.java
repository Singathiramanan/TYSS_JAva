package Sony;

public class CharacterCount {

	public static void main(String[] args) {
		String s="aaabbcddd";
		char fir=s.charAt(0);
		int count=0;
		for(int i=0;i<s.length();i++){
			
			if(fir==s.charAt(i)){
				count++;
			}else{
				System.out.print(s.charAt(i-1)+""+count);
				count=1;
				fir=s.charAt(i);
			}
		}
		System.out.println(s.charAt(s.length()-1)+""+count);

	}

}
