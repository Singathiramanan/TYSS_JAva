package Assignment0207;

import java.util.HashSet;

public class RemoveDuplicateInIntegerArray {

	public static void main(String[] args) {
		int[] a={4,1,4,2,0,2};
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<a.length;i++){
			set.add(a[i]);
		}
		for(Integer n:set){
			System.out.print(n+" ");
		}
	}

}
;