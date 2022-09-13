package Assignment;

public class AddTwoArrayWithException {

	public static void main(String[] args) {
		int[] a={3,5,9,10,6};
		int[] b={6,8,1,7,5};
		int length=a.length;
		if(a.length<b.length){
			length=b.length;
		}
		for(int i=0;i<length;i++){
			try {
				System.out.print(a[i]+b[i]+" ");
			} catch (Exception e) {
				if(a.length<b.length){
					System.out.print(b[i]+" ");
				}else{
					System.out.print(a[i]+" ");
				}
			}
		}
	}

}
