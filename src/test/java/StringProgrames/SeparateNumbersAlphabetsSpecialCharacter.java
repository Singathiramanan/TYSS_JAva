package StringProgrames;

public class SeparateNumbersAlphabetsSpecialCharacter {

	public static void main(String[] args) {
		String s="dfg2@#$%345fgh6!@#";
		String s1 = s.toLowerCase();
		String lc="",uc="",no="",sc="";
		for(int i=0;i<s1.length();i++){
			char ch = s1.charAt(i);
			if(ch>=65&&ch<=91)
				uc=uc+ch;
			else if(ch>=97&&ch<=123)
				lc=lc+ch;
			else if(ch>=48&&ch<=57)
				no=no+ch;
			else
				sc=sc+ch;
		}
		System.out.println(lc+uc+no+sc);
	}

}
