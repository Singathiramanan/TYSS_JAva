package StringProgrames;

public class PrintDuplicateCharWithOutUsingCollection {

	public static void main(String[] args) {
		String s="tester";
		for (int i = 0; i < s.length(); i++) {
			int count=0;
			for (int j = i; j < s.length(); j++) {
				if(s.charAt(i)==s.charAt(j)){
					count++;
					
				}
			}
			if(count>1)
				System.out.println(s.charAt(i));
		}

	}

}
