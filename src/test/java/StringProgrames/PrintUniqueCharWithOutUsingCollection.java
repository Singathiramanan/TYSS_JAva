package StringProgrames;

public class PrintUniqueCharWithOutUsingCollection {

	public static void main(String[] args) {
		String s="tester";
		for (int i = 0; i < s.length(); i++) {
			int count=0;
			for (int j = 0; j < s.length(); j++) {
				if(s.charAt(i)==s.charAt(j)&&i!=j){
					count++;
					break;
				}
			}
			if(count==0)
				System.out.println(s.charAt(i));
		}
		
	}

}
