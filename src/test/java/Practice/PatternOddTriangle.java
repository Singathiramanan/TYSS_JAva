package Practice;

public class PatternOddTriangle {

	public static void main(String[] args) {
		int no=7,sp=no-1,st=1;
//		for(int i=1;i<=no/2;i++){
		while(sp>=0){
			for(int j=1;j<=sp;j++){
				System.out.print(" ");
			}
			for(int j=st;j>=1;j--){
				System.out.print("* ");
			}
			sp-=2;
			st+=2;
			System.out.println();
		}
		
	}

}
