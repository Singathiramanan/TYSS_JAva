package Patterns;

public class xcvbnm {

	public static void main(String[] args) {
		int space=2,star=1;
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("* ");
			}
			space--;
			star+=2;
			System.out.println();
		}
		
	}

}
