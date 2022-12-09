package Iterview_pgm;

public class ReverseTriangle {
	
	public static void main(String[] args) {
		int no=7;
		for(int i=1;i<=no;i++){					//1
			for(int j=1;j<=no-i;j++){			//j<=6
				System.out.print("  ");
				
			}
			for(int j=no-i;j<no;j++){			//6<7
				System.out.print("* ");
			}
			System.out.println();
		}
	
	}

}
