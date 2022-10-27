package StringProgrames;

public class CountAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="zxcv bna sdfga sdfgasdf zxcvasdf";
		char[] s = str.toCharArray();

		for (int i = 97; i <=122 ; i++) {
			char alp=(char)i;
			int count = 0;
			for (int j = 0; j < s.length; j++) {
				if (alp==s[j]) {
					count++;
				}}
				if (count>0) {
					System.out.println(alp+" "+count);
				}
			
		}
				
			}

	}
