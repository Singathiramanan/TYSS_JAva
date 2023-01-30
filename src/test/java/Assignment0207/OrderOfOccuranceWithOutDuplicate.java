package Assignment0207;

import java.util.HashSet;

public class OrderOfOccuranceWithOutDuplicate {

	public static void main(String[] args) {
		int[] a={4,1,4,2,0,2};
		HashSet<Integer> set=new HashSet<Integer>();
		for(int i=0;i<a.length;i++){
			set.add(a[i]);
		}
		for(Integer n:set){	
			for(int i=0;i<a.length;i++){
				if(n==a[i]){
					System.out.println(n+" "+(i+1));
					break;
				}
					
			}
		}

	}

}
