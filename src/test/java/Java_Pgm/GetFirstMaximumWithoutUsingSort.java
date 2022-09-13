package Java_Pgm;

public class GetFirstMaximumWithoutUsingSort {

	public static void main(String[] args) {
		int[] a={20,30,10,50,10};
		int max=a[0];
		for(int i=1;i<a.length;i++){
			if(max<a[i]){				//20>30,20>10
				max=a[i];				//10
			}
		}
		System.out.println(max);
	}
}
