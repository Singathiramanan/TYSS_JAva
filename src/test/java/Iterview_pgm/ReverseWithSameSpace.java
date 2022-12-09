package Iterview_pgm;

public class ReverseWithSameSpace {

	public static void main(String[] args) {
		String str="i know tamil";					//t amil knowi
		String[] s2 = str.split(" ");
		String s1 = str.replace(" ", "");
		String rev="",wrev="",rev1="";
		for(int i=0,j=s1.length()-1;i<str.length();i++){
			if(str.charAt(i)!=' '){
			rev=rev+s1.charAt(j);
			j--;}
			else{
				rev+=" ";
			}
		}
		System.out.println(rev);
		
		System.out.println("=========");
		for(int i=0;i<s2.length;i++){
			wrev=s2[i]+wrev;
		}
		for(int i=0,j=0;i<str.length();i++){
			if(str.charAt(i)!=' '){
				rev1=rev1+wrev.charAt(j);
				j++;}
				else{
					rev1+=" ";
				}
		}
		System.out.println(rev1);
	}

}
