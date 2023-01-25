package Patterns;

import java.util.HashSet;
import java.util.Scanner;

public class xcvbnm {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		switch (no) {

		case 1:
			int space = 2, star = 1;
			for (int i = 1; i <= 3; i++) {			//      *
				for (int j = 1; j <= space; j++) {	//    * * *
					System.out.print("  ");			//  * * * * *
				}
				for (int j = 1; j <= star; j++) {
					System.out.print("* ");
				}
				space--;
				star += 2;
				System.out.println();
			}
			break;

		case 2:
			for (int i = 1; i <= 5; i++) {			// * * * * *
				for (int j = 1; j <= 5; j++) {		// * * * * *
					System.out.print("* ");			// * * * * *
				}									// * * * * *
				System.out.println();				// * * * * *
			}
			break;

		case 3:
			for (int i = 1; i <= 5; i++) { 			// *
				for (int j = 1; j <= i; j++) { 		// * *
					System.out.print("* "); 		// * * *
				} 									// * * * *
				System.out.println(); 				// * * * * *
			}
			break;

		case 4:
			for (int i = 1; i <= 5; i++) { 			// * * * * *
				for (int j = 5; j >= i; j--) { 		// * * * *
					System.out.print("* "); 		// * * *
				} 									// * *
				System.out.println(); 				// *
			}
			break;

		case 5:
			for (int i = 1; i <= 5; i++) {			//          *
				for (int j = 1; j <= 5 - i; j++) {	//        * *
					System.out.print("  ");			//		* * *
				}									//	  * * * * 
				for (int j = 5 - i; j < 5; j++) {	//  * * * * *
					System.out.print("* ");
				}
				System.out.println();
			}
			break;
		
		case 6:
			for(int i=1;i<=5;i++){					// * * * * *
				for(int j=1;j<i;j++){		  		//   * * * *
				System.out.print("  ");		    	//     * * *
				}				      				//       * *
				for(int j=i;j<=5;j++){		        //         *
				System.out.print("* ");
				}
				System.out.println();
			}
			break;
			
		case 7:
			String str="aabb";
			HashSet<Character> set=new HashSet<>();
			for(int i=0;i<str.length();i++){
				set.add(str.charAt(i));
			}
			boolean flag = true;
			for (Character character : set) {
				int count=0;
				for(int i=0;i<str.length()-1;i++){
					
					if(character==str.charAt(i)&&character==str.charAt(i+1)){
						count++;
					}
				}
				if(count==1){
					flag=true;
				}
				else{
					flag=false;
				}
			}
			if(flag==true){
				System.out.println("yes");
			}else{
				System.out.println("no");
			}
			
			
		}

	}

}
