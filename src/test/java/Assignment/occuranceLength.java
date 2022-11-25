package Assignment;

import java.util.HashSet;

public class occuranceLength {

	public static void main(String[] args) {
		int[] arr={0,1,1,0,1,3,0,4};
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<arr.length;i++){
			set.add(arr[i]);
		}
		for (Integer integer : set) {
			int count=0;
			for(int i=0;i<arr.length;i++){
				if(integer==arr[i]){
					count++;
				}
			}
			System.out.print(count);
		}
		for(int i=0;i<arr.length-set.size();i++){
			System.out.print(0);
		}
	}
}
