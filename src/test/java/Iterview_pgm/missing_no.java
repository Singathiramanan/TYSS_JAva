package Iterview_pgm;

public class missing_no {

	public static void main(String[] args) {
		int[] arr={2,5,7};
		int in=1,end=10;
		for(int i=in;i<=end;i++){
			int num=0;
			for (int j = 0; j < arr.length; j++) {
				if ((arr[j]==i)) {
					break;
				}
				else{
					System.out.println(i);
				}
			}
			
		}

	}

}
