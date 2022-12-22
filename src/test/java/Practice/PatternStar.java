package Practice;

public class PatternStar {

	public static void main(String[] args) {
		int sp = 4, st = 1, ct = 0;
		for (int i = 1; i <= 5; i++) {
			if (i % 2 == 1) {
				for (int j = 1; j <= sp; j++) {
					System.out.print(" ");
				}
				for (int j = st; j >= 1; j--) {
					System.out.print("* ");
				}
				ct += 1;
				if (ct % 2 == 1) {
					st += 2;
					sp -= 2;
				} else {
					st -= 2;
					sp += 2;
				}
			} else {
				for (int j = 1; j < 5; j++) {
					System.out.print(" *");
				}
			}
			System.out.println();
		}
	}

}
