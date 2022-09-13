package StringProgrames;

public class PrintUniqueWordsWithOutUsingCollection {

	public static void main(String[] args) {
		String s="welcome to bangalore welcome to tyss";
		String[] str = s.split(" ");
		for (int i = 0; i < str.length; i++) {
			int count=0;
			for (int j = 0; j < str.length; j++) {
				if(str[i].equals(str[j])&&i!=j){
					count++;
					break;
				}
			}
			if(count==0)
				System.out.println(str[i]);
		}

	}

}
