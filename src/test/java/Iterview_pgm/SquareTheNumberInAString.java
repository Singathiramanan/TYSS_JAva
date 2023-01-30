package Iterview_pgm;

public class SquareTheNumberInAString {

	public static void main(String[] args) {
		
		String str="A3B2D4";
		int sumc=0,square=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>=48 && str.charAt(i)<=57){
				square=(str.charAt(i)-48)*(str.charAt(i)-48);
				sumc+=square;									//9+4+16=29
			}
		}
		System.out.println(sumc);
		
		int no=121,sum=0,copy=no;
		while(no!=0){
			int rem=no%10;
			sum+=(rem*rem*rem);
			no=no/10;
		}
		if(sum==copy){
			System.out.println("It is an armstrong number");
		}else{
			System.out.println("It is not an armstrng number");
		}
		
		int n=28,sum1=0;
		for(int i=1;i<n;i++){
			if(n%i==0){
				sum1+=i;
			}
		}
		if(sum1==n){
			System.out.println("it is a strong number");
		}else{
			System.out.println("it si not a strong number");
		}
		
	}

}
