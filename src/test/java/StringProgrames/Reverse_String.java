package StringProgrames;

public class Reverse_String {

	public static void main(String[] args) {
		String s="tester";
		int l = s.length();
		String r="";
		for(int i=l-1;i>=0;i--){
			//way1 using 3rd variable
			r=r+s.charAt(i);
			//way2 w/o using 3rd variable
			//System.out.print(s.charAt(i));
		}
		System.out.println(r);
		//way3 using tochararray
		char[] arr = s.toCharArray();
		for(int i=arr.length-1;i>=0;i--){
			System.out.print(arr[i]);
		}
		
	}
}
