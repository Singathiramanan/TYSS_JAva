package Java_Pgm;

public class GetSecondMaximumNumber {

	public static void main(String[] args) {
		int a[]={20,30,10,50,40};
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]<a[j]){				//i=10,j=20
					a[i]=a[i]+a[j];			//i=i+j,30
					a[j]=a[i]-a[j];			//j=i-j,30-20=10=j
					a[i]=a[i]-a[j];			//i=i-j,30-10=20=i
				}
			}			
		}
		System.out.println("Second maximum Number is "+a[1]);

	}

}
