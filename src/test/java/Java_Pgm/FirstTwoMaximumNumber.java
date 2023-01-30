package Java_Pgm;

public class FirstTwoMaximumNumber {

	public static void main(String[] args) {
//		@SuppressWarnings("resource")
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the size of an array:");
//		int[] size={
//		int[] a=new int[size];
//		for(int i=0;i<size;i++){
//			a[i]=sc.nextInt();
//		}
		int[] a={30,1,50,40,150,150,10,10};
		int fmax=a[0];
		int smax=a[0];
		for(int i=1;i<a.length;i++){//i=1 
			
			if(fmax<a[i] && fmax!=a[i]){			//50<=40,50<=150150<=150,10<=150
									//
				smax=fmax;			//30<=40 .40,50
				
				fmax=a[i];			//50 ,150,150
			}
			else if(smax<a[i]){	//50<=10
				smax=a[i];
			}	
		}
		System.out.println(fmax);//150
		System.out.println(smax);//50
	}

}
