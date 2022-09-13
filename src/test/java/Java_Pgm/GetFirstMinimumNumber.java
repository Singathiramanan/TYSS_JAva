package Java_Pgm;

public class GetFirstMinimumNumber {

	public static void main(String[] args) {
		int a[]={20,30,10,50,40};				//10,20,30,50,40
		for(int i=0;i<a.length;i++){			//2
			for(int j=i+1;j<a.length;j++){		//2<5,3
				if(a[i]>a[j]){					//20>50,20>40
					int temp=a[i];					//t=30	
					a[i]=a[j];						//20
					a[j]=temp;						//30
					
					
				}
				
				
			}
			
			
		}
		for (int k = 0; k < a.length; k++) {
			System.out.print(a[k]+" ");
		}
		System.out.println();
		System.out.println("First minimum Number is "+a[0]);
	}

}
