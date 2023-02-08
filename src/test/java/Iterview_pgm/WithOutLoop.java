package Iterview_pgm;

public class WithOutLoop {

	public static void main(String[] args) {
		String str="my name is siva";
		String[] s=str.split(" ");
		int i=s.length-1;
		String wos = reverse(s,i);
		System.out.println(wos);
		int j=0,k=0;
		String rev=addSpace(str,wos,k,j);
		System.out.println(rev);
	}

	private static String addSpace(String str, String wos, int i, int j) {
		String ws="";
		if(i<str.length()){
			if(!(str.charAt(i)>='a'&&str.charAt(i)<='z')){
				ws=ws+str.charAt(i);
			}else{
				ws+=wos.charAt(j);
				j++;
			}
			i++;
			ws+=addSpace(str, wos,i,j);					
		}
		
		return ws;
	}

	private static String reverse(String[] s, int i) {
		String str="";
		if(i>=0){
		str=str+s[i];		
		i--;
		str+=reverse(s,i);
		}
		return str;
	}

}
