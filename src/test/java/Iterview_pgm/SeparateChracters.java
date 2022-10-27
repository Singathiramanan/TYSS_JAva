package Iterview_pgm;

public class SeparateChracters {

	public static void main(String[] args) {
		String s="23456rtySDFGHJK!@#$%";
		String no="",lc="",uc="",sc="";
		for(int i=0;i<s.length()-1;i++){
			char ch = s.charAt(i);
			if(ch>=48 && ch<=57)
				no=no+ch;
			else if(ch>=65 && ch<=90)
				uc=uc+ch;
			else if(ch>=97 && ch<=122)
				lc=lc+ch;
			else{
				sc=sc+ch;
			}
			
		}
		System.out.println(no);
		System.out.println(lc);
		System.out.println(uc);
		System.out.println(sc);
	}

}
