package Iterview_pgm;

public class starPattern {

	public static void main(String[] args) {
		int n=5,space=3,star=1,count=1;				
		for(int i=1;i<=n;i++){			
			if(i%2==1){
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++){
				System.out.print("* ");
			}
			++count;
			if(count%2==0){
			space=space-2;
			star=star+2;
			}else{
				space=space+2;
				star=star-2;
			}
			}else if(i%2==0){
				for(int k=1;k<n;k++){
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

}
