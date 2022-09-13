package Assignment0207;

import java.util.HashSet;

public class CountOfUniqueNumbersInArray {

	public static void main(String[] args) {
		int[] a={4,1,4,2,0,2};
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<a.length;i++){
			set.add(a[i]);
		}
		System.out.println("no"+" "+"count");

		for(Integer n:set){
			int count=0;
			for(int i=0;i<a.length;i++){
				if(n==a[i])
					count++;
			}
			if(count==1)
			System.out.println(n+"     "+count);
		}

	}

}
