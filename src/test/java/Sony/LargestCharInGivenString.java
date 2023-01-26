package Sony;

public class LargestCharInGivenString {

	public static void main(String[] args) {
		String str="aaBabXyYCcDaxA";
		String lc="",uc="";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
				lc+=str.charAt(i);
			}else{
				uc+=str.charAt(i);
			}
		}
		char max=uc.charAt(0);
		for(int i=0;i<uc.length();i++){
			for(int j=0;j<lc.length();j++){
				if(uc.charAt(i)==(lc.charAt(j)-32)){
					if(max<uc.charAt(i)){
						max=uc.charAt(i);
					}
				}
			}
		}
		System.out.println(max);
	}

}
