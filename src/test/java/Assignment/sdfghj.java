package Assignment;

import java.util.Arrays;

public class sdfghj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=30;
		int[] A={6,22,2,13,30,28,4,14,12,12,17,12,12,25,26,21,21,24,4,10,9,12,18,2,6,2,8,28,4,1,22,15,30,8,2,1,4,16,24};
		int[] B={8,12,15,26,8,15,14,25,33,13,23,28,29,8,12,31,13,33,0,6,27,14,8,34,26,27,23,28,22,25,13,22,34,30,35,25,28,28,27};
		int pair=0;
		Arrays.sort(A);
		Arrays.sort(B);
	    for (int i=0;i<A.length;i++) { 
	    	System.out.print(B[i]);
	    	
	    	
	            if(A[i]+B[i]>=k){
	                pair++;  	            
	        }
	    }
	    System.out.println(pair);
	    if(pair==A.length){
	            System.out.println("YES");
	        }else{
	            System.out.println("NO");
	        }
	    }

	

}
