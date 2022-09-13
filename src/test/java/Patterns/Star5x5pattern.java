package Patterns;

public class Star5x5pattern {

	public static void main(String[] args) {
		int no=5;
		for(int i=0;i<no;i++){
			for(int j=0;j<no;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println();
		
		for (int i = 1; i <= no; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println();
		for (int i = 1; i <= no; i++) {
			for (int j = i; j <= no; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println();
		for (int i = 1; i <= no; i++) {
			for (int j = i; j <= no; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println();
		for (int i = 1; i <= no; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j <= no; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println();
		for (int i = 1; i < no; i++) {
			for (int j = i; j <= no; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 1; i <= no; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= no; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println();
		for (int i = 1; i <= no; i++) {
			for (int j = i; j <= no; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j < i; j++) {
				System.out.print("* ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println();
		for (int i = 1; i <= no; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j < no; j++) {
				System.out.print("* ");
			}
			for (int j = i; j <= no; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
		System.out.println();

		System.out.println();
		for (int i = 1; i < no; i++) {
			for (int j = i; j <= no; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j < i; j++) {
				System.out.print("* ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 1; i <= no; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j < no; j++) {
				System.out.print("* ");
			}
			for (int j = i; j <= no; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
		System.out.println();

		System.out.println();


	}

}
