package Iterview_pgm;

public class mock3 {

	public static void main(String[] args) {
		String str="a2b9c2";
		int no=0;
		int count=0;
		for(int i=0;i<str.length();i++){			 
			if(str.charAt(i)>=48 && str.charAt(i)<=57){
				no+=str.charAt(i)-48;
				count++;	
			} 
				for(int j=0;j<no;j++){
					System.out.print(str.charAt(i-count));	
				}
				count=0;
				no=0;
		}
	}

}
