package Java_Pgm;

public class PrintMissingNumber {

	public static void main(String[] args) {
		int[] a={1,2,4,5,7,10};
		for(int i=0;i<a.length-1;i++){
			int n=a[i+1]-a[i];
			int count=1;
			while(n>1){											//10-7=3>1,1<1
				System.out.print(a[i]+count+" ");				//7+1=8,7+2=9,
				count++;										//3
				n--;											//1
			}
		}
		
	}

}
