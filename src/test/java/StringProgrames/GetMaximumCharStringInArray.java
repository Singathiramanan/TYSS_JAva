package StringProgrames;

public class GetMaximumCharStringInArray {

	public static void main(String[] args) {
		String[] s={"7","5678","3456","1234","67890","12"};
		int max=s[0].length();
		for(int i=1;i<s.length;i++){
			
			if(max<s[i].length()){
				max=s[i].length();
			}
		}
		for(int i=0;i<s.length;i++){
			if(s[i].length()==max)
				System.out.println(s[i]);
		}
		
	}

}
