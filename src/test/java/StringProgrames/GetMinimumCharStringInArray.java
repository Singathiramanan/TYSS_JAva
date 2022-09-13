package StringProgrames;

public class GetMinimumCharStringInArray {

	public static void main(String[] args) {
		String[] s={"7","5678","3456","1234","67890","12"};
		int min=s[0].length();
		for(int i=1;i<s.length;i++){
			if(min>s[i].length()){
				min=s[i].length();
			}
		}
		
		for(int i=0;i<s.length;i++){
			if(s[i].length()==min)
				System.out.println(s[i]);
		}
		

	}

}
