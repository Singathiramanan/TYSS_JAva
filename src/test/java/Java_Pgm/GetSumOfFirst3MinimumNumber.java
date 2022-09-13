package Java_Pgm;

import java.util.Scanner;

public class GetSumOfFirst3MinimumNumber {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] a=new int[size];	
		for(int i=0;i<size;i++){
			a[i]=sc.nextInt();
		}
		//int a[]={20,30,10,50,40};
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int sum=0;
		for(int i=0;i<3;i++){
			sum=sum+a[i];
		}
		System.out.println(sum);
	}

}
