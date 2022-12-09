package Iterview_pgm;

public class mock1 {

	public static void main(String[] args) {
		String str="I love india";
		String s1=str.replace(" ","");							//Iloveindia
		String rev="";
		   for(int i=0,j=s1.length()-1;i<str.length();i++){		//i=I, ,l,o,v,e, ,i,n,d,i,a	
			if(str.charAt(i)!=' '){								//j=a,i,d,n,i,e,v,o,l,I
				rev+=s1.charAt(j);								
				j--;
			}else{
				rev+=" ";			//str.charAt(i)							//rev=a,a ,a i,a id,a idn,a idni,a idni ,a idni e,a idni ev,a idni evo,a idni evol,a idni evolI
			}
		   }
			System.out.println(rev);
	}
 
}
