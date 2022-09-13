package StringProgrames;

public class SumOF2DigitNumbers {

	public static void main(String[] args) {
		String s="a12bc11d5";
		int sum=0,no=0,tsum=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
				no=s.charAt(i)-48;
				tsum=tsum*10+no;
			}else{
				sum=sum+tsum;
				tsum=0;
			}
		}
		sum=sum+tsum;
		System.out.println(sum);
	}
}
