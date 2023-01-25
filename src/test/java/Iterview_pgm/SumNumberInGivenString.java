package Iterview_pgm;

public class SumNumberInGivenString {

	public static void main(String[] args) {
		String str="http://2345678sdfghj3456789vb34567v56u9";
		long tsum=0,sum=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>='0' && str.charAt(i)<='9'){
				tsum=tsum*10+(str.charAt(i)-48);
			}else{
				sum+=tsum;
				tsum=0;
			}
		}
		sum+=tsum;
		System.out.println(sum);
	}

}
