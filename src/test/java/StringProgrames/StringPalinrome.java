package StringProgrames;

public class StringPalinrome {

	public static void main(String[] args) {
		String s="malayalam",rev="";
		for(int i=s.length()-1;i>=0;i--){
		rev=rev+s.charAt(i);
		}
		if(rev.equals(s)){
			System.out.println("It is a palinrome");
		}else{
			System.out.println("It is not a palinrome");
		}
		
	}

}
