package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseList {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<>();
			list.add(50);
			list.add(70);
			list.add(60);
			list.add(90);
			list.add(20);
			list.add(10);
			list.add(30);
			list.add(40);
			list.add(80);
			
		List<Integer> list1 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
			Collections.sort(list);
			//Collections.sort(list, Comparator.reverseOrder());
			Collections.reverse(list);
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}

}
