package Java_Pgm;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class RotateArrayUsingCollection {

	public static void main(String[] args) {
		int[] nos={1,3,5,7,9,2,4,7,8};
		List<Integer> list=new LinkedList<Integer>();
		for(int i=0;i<nos.length;i++){
			list.add(nos[i]);
		}
		Collections.rotate(list, 5);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
	}

}
