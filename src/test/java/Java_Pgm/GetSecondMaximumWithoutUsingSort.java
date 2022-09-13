package Java_Pgm;

public class GetSecondMaximumWithoutUsingSort {

	public static void main(String[] args) {
		int[] a={20,30,10,50,40};
		int fmax=a[0];
		int smax=a[0];
		for(int i=1;i<a.length;i++){
			if(fmax<a[i]){
				if(fmax!=a[i]){		//
					smax=fmax;			//30<=40 .40,50
					}
					fmax=a[i];			//50 ,150,150
				}
				else if(smax<=a[i]){	//50<=10
					smax=a[i];
				}	
			
		}
		System.out.println(fmax);
		
	}

}
