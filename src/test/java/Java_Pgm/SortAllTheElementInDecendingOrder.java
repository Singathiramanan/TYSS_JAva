package Java_Pgm;

public class SortAllTheElementInDecendingOrder {

	public static void main(String[] args) {
		int a[]={20,30,10,50,40};		
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]<a[j]){
					a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];
				}
			}
			System.out.print(a[i]+" ");
		}

	}

}
