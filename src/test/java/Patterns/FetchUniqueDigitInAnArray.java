package Patterns;

import java.util.Scanner;

public class FetchUniqueDigitInAnArray {

	public static void main(String[] args) {
		Scanner myObj=new Scanner(System.in);
		System.out.println("Enter the String");
		String line=myObj.nextLine();
		int[] numbers=takeInput(line.trim());
		System.out.println(new Solution().uniqueDigit(numbers));
		myObj.close();
	}

	private static int[] takeInput(String input) {
		if(input.length()== 0){
			return new int[0];
		}
		String[] parts=input.split("");
		int[] output=new int[parts.length];
		for(int index=0;index<parts.length;index++){
			String part=parts[index].trim();
			output[index]=Integer.parseInt(part);
		}
		return output;
	}

}
