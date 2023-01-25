package Assignment0207;

public class sdfghjk {

	public static void main(String[] args) {
		String s="i am raju";
		String rev="",s1="";
		String[] st = s.split(" ");
		for(int i=st.length-1;i>=0;i--){
			rev+=st[i];
		}
		System.out.println(rev);
		for(int i=0,j=0;i<s.length();i++){
			if(s.charAt(i)!=' '){
				s1+=rev.charAt(j);
				j=j+1;
			}else{
				s1+=s.charAt(i);
			}
		}
		System.out.println(s1);

	}

}
