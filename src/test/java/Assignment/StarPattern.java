package Assignment;

public class StarPattern {

	public static void main(String[] args) {
		// 1 2 3 4 5
		// 1 * * * * *==i
		// 2 * * * * *
		// 3 * * * * *
		// 4 * * * * *
		// 5 * * * * *
		// j
		int no = 5;

		// for(int i=1;i<=no;i++){
		// for(int j=1;j<=no;j++){
		// System.out.print("* ");
		// }
		// System.out.println();
		// }

		// 1 2 3 4 5
		// 1 * ==i
		// 2 * *
		// 3 * * *
		// 4 * * * *
		// 5 * * * * *
		// j
//		for (int i = 1; i <= no; i++) {
//			for (int j = 1; j <= i; j++) { // 1,1<=1,2,2<=1,2,1<=2,2,2<=2,3,3<=2
//				System.out.print("* ");
//			}
//			System.out.println();
//		}

		// 	 1 2 3 4 5
		// 1         * ==i
		// 2       * *
		// 3     * * *
		// 4   * * * *
		// 5 * * * * *
		// j
		
		for(int i=1;i<=no;i++){
			for(int j=1;j<=no-i;j++){
				System.out.print("  ");
			}
			for(int j=no-i+1;j<=no;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
