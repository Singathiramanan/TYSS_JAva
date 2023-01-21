package Sony;

import java.util.Arrays;

public class Max3Sum {

	public static void main(String[] args) {
		int[] arr={7,-3,0,2,1,-9};
		Arrays.sort(arr);
		int sum=0;
		for(int i=arr.length-1;i>arr.length-4;i--){
			sum+=arr[i];
		}
		System.out.println(sum);
	}

}
