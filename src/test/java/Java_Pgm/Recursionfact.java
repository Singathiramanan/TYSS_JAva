package Java_Pgm;

public class Recursionfact {

	public static void main(String[] args) {
		int output = factorial(7);
		System.out.println(output);
	}
	static int factorial(int i) {
		if(i<-1){
			return i*factorial(i+1); //5*4*3*2
	
		}else if(i>1){
			return i*factorial(i-1);  
		}else{
			return i;
		}
		
	}

}
