package StringProgrames;

public class CountAVowvelsInAString {

	public static void main(String[] args) {
		String str="bangAlurU";
		str=str.toLowerCase();
		char[] ch = str.toCharArray();
		int count=0;
		//char[] vow={'a','e','i','o','u'};
		for(int i=0;i<ch.length;i++){
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
				count++;
		}
//		for(int i=0;i<ch.length;i++){
//			for(int j=0;j<vow.length;j++){
//				if(ch[i]==vow[j]){
//					count++;
//				System.out.print(ch[i]);}
//			}
//			
//		}
		
		System.out.println(count);
	}

}
