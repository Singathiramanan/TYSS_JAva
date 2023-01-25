 package Java_Pgm;

public class RotateArray {

	public static void main(String[] args) {
		int[] a={1,2,3,4,5};			//45123
		int temp=0;
		int key=3;
		for(int i=0;i<key;i++){						//2
			temp=a[0];								//3
			for(int j=0;j<a.length-1;j++){
				a[j]=a[j+1];						//2,3,4,5,1 //3,4,5,1,2 //4,5,1,2,
			}
			a[a.length-1]=temp;	
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}

	}

}
