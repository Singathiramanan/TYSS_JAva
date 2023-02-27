package Assignment;

public class NumberPalinrome {

	public static void main(String[] args) {
		int no=121,rev=0,copy=no;
		while(no!=0){
			int rem=no%10;
			rev=rem+(rev*10);
			no=no/10;
		}
		if(copy==rev){
			System.out.println("Given number is palinrome");
		}else{
			System.out.println("Given number is not palinrome");
		}

	}

}
