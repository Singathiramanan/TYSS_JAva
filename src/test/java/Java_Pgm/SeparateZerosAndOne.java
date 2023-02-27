package Java_Pgm;

public class SeparateZerosAndOne {

	public static void main(String[] args) {
		
		char[] s={'0','0','1','1','0','1','1','0'};
		char[] b=new char[s.length];
		int count=0;
		for (int i = 0; i < s.length; i++) {
			
			if(s[i]-48!=0)
				count++;
		}
		System.out.println(count);
		for (int i = 0; i < s.length; i++) {
			if(s[i]-48!=0){
				b[i]=s[i];
			}else {
				b[count]=s[i];
				count++;
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
		}
	}

}
