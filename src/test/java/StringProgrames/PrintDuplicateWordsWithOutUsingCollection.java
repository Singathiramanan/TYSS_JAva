package StringProgrames;

public class PrintDuplicateWordsWithOutUsingCollection {

	public static void main(String[] args) {
		String s="welcome to bangalore welcome to tyss";
		String[] str = s.split(" ");
		for (int i = 0; i < str.length; i++) {
			int count=0;
			for (int j = i; j < str.length; j++) {
				if(str[i].equals(str[j])){
					count++;
				}
			}
			if(count>1)
				System.out.println(str[i]);
		}

	}

}
