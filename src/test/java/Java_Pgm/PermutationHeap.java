package Java_Pgm;

public class PermutationHeap {

	public static void main(String[] args) {
		int []no={1,2,4};
		int len=no.length;
		permute(no,len,len);
	}

	private static void permute(int[] no, int size, int n) {
		if(size==1){
			for (int i = 0; i < n; i++) {
				System.out.print(no[i]);
			}
			System.out.println();
		}
		for (int i = 0; i < size; i++) {
			permute(no, size-1, n);				//3,2,1,0,1
			if(size%2==1){						
				int temp=no[0];
				no[0]=no[size-1];
				no[size-1]=temp;				
			}else{
				int temp=no[i];
				no[i]=no[size-1];
				no[size-1]=temp;
			}
		}
	}

}
