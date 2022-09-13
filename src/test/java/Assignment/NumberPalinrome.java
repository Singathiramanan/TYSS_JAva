package Assignment;

public class NumberPalinrome {

	public static void main(String[] args) {
		int no=12321,rev=0,rem=0;
		while(no!=0){
			rem=no%10;
			rev=rem+(rev*10);
			no=no/10;
		}
		if(no==rev){
			System.out.println("Given number is palinrome");
		}else{
			System.out.println("Given number is not palinrome");
		}

	}

}
