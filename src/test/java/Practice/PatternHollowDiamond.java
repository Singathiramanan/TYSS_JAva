package Practice;

public class PatternHollowDiamond {

	public static void main(String[] args) {
		int n=5,sp=n-1,st=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=sp;j++){
				System.out.print(" ");
			}
			for(int j=st;j>=1;j--){
				if(j==1 || j==st){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			st+=1;
			sp-=1;
			System.out.println();
		}
		st-=1;
		sp+=1;
		for(int i=1;i<=n-1;i++){
			st-=1;
			sp+=1;
			for(int j=1;j<=sp;j++){
				System.out.print(" ");
			}
			for(int j=st;j>=1;j--){
				if(j==1 || j==st){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			
			System.out.println();
		}

	}

}
