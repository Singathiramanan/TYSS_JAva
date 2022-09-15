package Patterns;

import java.util.HashMap;
import java.util.Scanner;

public class RomanNumberCount {
	public static void main(String[] args) {
		int[] val = { 1, 5, 10, 50, 100, 500, 1000 };
		char[] ch = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < ch.length; i++) {
			map.put(ch[i], val[i]);
		}
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Roman Character");
		String s = sc.next();
		int sum = 0;
		if (s.length() <= 15) {
			for (int i = 0; i < s.length(); i++) {
				if (map.containsKey(s.charAt(i)) ) {
					if (i!=s.length()-1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
						sum = sum + (map.get(s.charAt(i + 1)) - map.get(s.charAt(i)));
						i=i+1;
					} else {
						sum = sum + map.get(s.charAt(i));
					}
				} else {
					System.out.println("Enter CORRECT Roman Character");
					break;
				}
			}
			if (sum < 3999) {
				System.out.println(sum);
			} else {
				System.out.println("Limit Exceed");
			}
		}else{
			System.out.println("String Limit Exceed");
		}

	}

}
