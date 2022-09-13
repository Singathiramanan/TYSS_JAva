package StringProgrames;

public class SumOfNumberCharacter {

	public static void main(String[] args) {
		String s="a1b3d4";
		int sum=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
				sum=sum+Integer.parseInt(String.valueOf(s.charAt(i)));
				//sum=sum+(s.charAt(i)-48);
				
			}
		}
		System.out.println(sum);

	}

}
