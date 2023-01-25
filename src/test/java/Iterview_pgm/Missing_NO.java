package Iterview_pgm;

public class Missing_NO {

	public static void main(String[] args) {
		int[] a={2,5,7};
		for(int i=1;i<=10;i++){
			boolean flag = true;
			for(int j=0;j<a.length;j++){
				if(i==a[j]){
					flag=false;
				}
			}
			if(flag)
			System.out.print(i+" ");
		}

	}

}
