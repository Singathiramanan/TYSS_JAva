package Java_Pgm;

public class PermutationRecursion {

	public static void main(String[] args) {
		/*String no="124";
		int min=Integer.parseInt(no);
		int max=Integer.parseInt(no);
		LinkedList<Character> ch=new LinkedList<>();
		for (int i = 0; i < no.length(); i++) {
			ch.add(no.charAt(i));
			
		}
		for (int i = 0; i < 6; i++) {
			Collections.shuffle(ch);
			System.out.println(ch);
		}*/
		String s="IDFC";
		int len=s.length();
		permutation(s,0,len-1);
		
	}

	public static void permutation(String s, int i, int j) {
		if (i==j) {
			System.out.println(s);
		}else{
			for (int k = i; k <= j; k++) {
				s=swapchar(s,i,k);
				permutation(s, i+1, j);
				s=swapchar(s, i, k);
			}
		}
		
		
	}

	public static String swapchar(String s, int i, int k) {
		char temp;
		char[] charr = s.toCharArray();
		temp=charr[i];
		charr[i]=charr[k];
		charr[k]=temp;
		return String.valueOf(charr);
	}

}
