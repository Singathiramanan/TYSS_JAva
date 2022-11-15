package Assignment;

public class FindAllPossibleSubString {

	public static void main(String[] args) {
		String s="javajajavajavaseleniumjava";
		int count=0;
		for(int i=0;i<s.length();i++){
			for(int j=i+1;j<=s.length();j++){
				System.out.println(s.substring(i, j));
				if(s.substring(i, j).equals("java"))
					count++;
			}
		}
		System.out.println(count);
	}

}
