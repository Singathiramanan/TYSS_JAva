package Patterns;

public class Number5x5Pattern {

	public static void main(String[] args) {
		int no = 5;
		for(int i=1;i<=no;i++){
			for(int j=1;j<=no;j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println();
		for(int i=1;i<=no;i++){
			for(int j=1;j<=no;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println();
		for(int i=1;i<=no;i++){
			for(int j=i;j<=no;j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println();
		for(int i=1;i<=no;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println();
		for(int i=1;i<=no;i++){
			for(int j=i,k=1;j<=no;j++,k++){
				System.out.print(k+" ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println();
		for(int i=1;i<=no;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println();
		for(int i=1;i<=no;i++){
			for(int j=1;j<=i;j++){
				System.out.print("1 ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println();
		for(int i=1;i<=no;i++){
			for(int j=1;j<=i;j++){
				if(i%2==0)
				System.out.print("2 ");
				else
				System.out.print("1 ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println();
		

	}

}
