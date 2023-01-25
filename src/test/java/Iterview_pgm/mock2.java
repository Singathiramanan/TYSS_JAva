package Iterview_pgm;

public class mock2 {

	public static void main(String[] args) {
		String str="welcome to india";
		String[] s1=str.split(" ");
		for(int i=0;i<s1.length;i++){
			String rev="";
			for(int j=s1[i].length()-1;j>=0;j--){
				rev+=s1[i].charAt(j);
			}
			System.out.print(rev+" ");
		}

	}

}
