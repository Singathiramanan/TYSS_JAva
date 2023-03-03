package Iterview_pgm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

public class Student extends Subject{

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<String, Integer> map=new HashMap<>();
		System.out.println("Enter Total no of student");
		int total = sc.nextInt();
		System.out.println("Enter Total no of subject");
		int subCount = sc.nextInt();
		System.out.println("Enter Name and rollNo");
		for (int i = 0; i < total; i++) {
			map.put(sc.next(), sc.nextInt());
		}
		HashMap<String, List<String>> allDetails = subs(subCount,map);
		int rollNO = sc.nextInt();
		for(Entry<String, Integer> details:map.entrySet()) {
			if(details.getValue()==rollNO) {
				for(Entry<String, List<String>> details1:allDetails.entrySet()) {
					if(details1.getKey().equals(details.getKey())) {
						System.out.println(details1.getKey()+" "+details1.getValue());
					}
				}
			}
		}
	}

}
class Subject{
	@SuppressWarnings("resource")
	public static HashMap<String, List<String>> subs(int subCount,HashMap<String, Integer> map) {
		Scanner sc=new Scanner(System.in);
		HashMap<String, List<String>> maps=new HashMap<>();
		for(Entry<String, Integer> entry:map.entrySet()){
		String name = entry.getKey();
		List<String> sub=new ArrayList<String>();
		System.out.println("Enter All Subject");
		for (int i = 0; i < subCount; i++) {
			sub.add(sc.next());
		}
		maps.put(name, sub);
		}
		return maps;
	}
}