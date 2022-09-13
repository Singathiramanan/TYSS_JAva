package Java_Pgm;

public class GetMaximumCharStringInArray {

	public static void main(String[] args) {
		String[] s={"hi","hello","one","four","killer","rainbow"};
		int max=s[0].length();					//2
		for(int i=1;i<s.length;i++){
			
			if(max<s[i].length()){				//2<5,5<3,5<4,5<6,6<7
				max=s[i].length();				//5,6,7
			}
		}
		for(int i=0;i<s.length;i++){
			if(s[i].length()==max)			//2==7,5==7,3==7,4==7,6==7,7==7
				System.out.println(s[i]);
		}
		
	}

}
