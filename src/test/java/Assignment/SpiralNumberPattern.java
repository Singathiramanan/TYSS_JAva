package Assignment;

import java.util.Scanner;

public class SpiralNumberPattern {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int no=sc.nextInt();
		int r=no,c=no;
		int[][] arr=new int[r][c];
		int n=r-1,b=0,add=1,m=c-1,d=0;
		for (int i = 0; i < no/2; i++,r=r-2,m--) {
			for(int j=i;j<r&&b<c;j++,b++){
				arr[j][b]=add++; 
			}
			b=i+i+2;
			for(int j=n-1;j>=i;j--){
				arr[j][m]=add++;
			}
			n=n-2;
			for(int j=m-1;j>d;j--){
				arr[i][j]=add++;
			}
			d=d+2;
		}
		for(int i=0;i<no;i++){
			for(int j=0;j<no;j++){
				if(j<i)
				{
					System.out.print(" "+"  ");
				}else
				{
					System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();
		}
	}

}
