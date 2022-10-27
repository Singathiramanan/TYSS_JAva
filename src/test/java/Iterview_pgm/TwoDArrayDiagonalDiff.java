package Iterview_pgm;

import java.util.Scanner;

public class TwoDArrayDiagonalDiff {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int size = sc.nextInt();
		int[][] arr=new int[size][size];
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		int s1=0,s2=0;
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				if(i==j)
					s1=s1+arr[i][j];
				if(j==size-1-i)
					s2=s2+arr[i][j];
			}
		}
		
		int diff=s1-s2;
		System.out.println(diff);
		
	}

}
