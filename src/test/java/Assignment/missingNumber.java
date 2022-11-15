package Assignment;

public class missingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={2,4,5,6,9,12,14};
		for(int i=0;i<arr.length-1;i++){
			int n=arr[i+1]-arr[i];
			int count=1;
			while(n>1){
				System.out.println(arr[i]+count);
				n--;
				count++;
			}
		}

	}

}
