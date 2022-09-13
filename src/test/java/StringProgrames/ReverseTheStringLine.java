package StringProgrames;

public class ReverseTheStringLine {

	public static void main(String[] args) {
		String s="this is test yentra";
		String[] str = s.split(" ");
		for (int i = str.length-1; i >=0; i--) {
			System.out.print(str[i]+" ");
		}
		System.out.println();
		for(int i=0;i<str.length;i++){
			String st=str[i];
			for(int j=st.length()-1;j>=0;j--){
				System.out.print(st.charAt(j));
			}
			System.out.print(" ");
		}
	}
}
