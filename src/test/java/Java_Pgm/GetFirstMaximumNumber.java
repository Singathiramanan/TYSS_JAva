package Java_Pgm;

public class GetFirstMaximumNumber {

	public static void main(String[] args) {
		int a[]={20,30,10,50,40};
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]<a[j]){			//20<30,30<10,30<50,50<40
//					a[i]=a[i]+a[j];		//
//					a[j]=a[i]-a[j];
//					a[i]=a[i]-a[j];
					int temp=a[i];
					a[i]=a[j];			//30,50
					a[j]=temp;
				}
			}			
		}
		System.out.println("First maximum Number is "+a[0]);	//[50,40,30,20,10]
	}

}
