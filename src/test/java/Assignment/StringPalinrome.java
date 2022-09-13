package Assignment;

public class StringPalinrome {

	public static void main(String[] args) {
		String s="malayalam",rev="";
		for(int i=s.length()-1;i>=0;i--){
		rev=rev+s.charAt(i);
		}
		if(s.equals(rev)){
			System.out.println("It is palinrome");
		}else{
			System.out.println("It is not palinrome");
		}
	}

}
