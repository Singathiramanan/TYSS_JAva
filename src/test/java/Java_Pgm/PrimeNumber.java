package Java_Pgm;

public class PrimeNumber {

	public static void main(String[] args) {
		int[] a={3,4,5,6,7,8,9,10,11,12,13};
		
		for(int i=0;i<a.length;i++){
			int j=2;
			int n=a[i];
			while(true){
				if(n%j==0){
					break;
				}
				else{
					j++;
				}
			}
			if(j==n)
			System.out.print(a[i]+" ");
		}
		
	}
	

}
