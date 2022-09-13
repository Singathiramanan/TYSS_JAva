package Assignment;

public class AddTwoArray {

	public static void main(String[] args) {
		int[] a={3,5,9,10,6,7,8};
		int[] b={6,8,1,7,5};
		int l1=a.length;
		int l2=b.length;
		if(l1==l2){
			for(int i=0;i<l2;i++){
				System.out.print(a[i]+b[i]+" ");
			}
		}
		else if(l1<l2){
			int diff=l2-l1;
			int[] a1=new int[l1+diff];
			for (int i = 0; i < a.length; i++) {
				a1[i]=a[i];
			}
			for(int i=0;i<l2;i++){
				System.out.print(a1[i]+b[i]+" ");
			}
		}
		else if(l1>l2){
			int diff=l1-l2;
			int[] b1=new int[l2+diff];
			for (int i = 0; i < b.length; i++) {
				b1[i]=b[i];
			}
			for(int i=0;i<l1;i++){
				System.out.print(b1[i]+a[i]+" ");
			}
		}

	}

}
