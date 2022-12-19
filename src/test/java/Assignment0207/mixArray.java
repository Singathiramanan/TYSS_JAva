package Assignment0207;

public class mixArray {

	public static void main(String[] args) {
		char[] a={'a','b','c','d','e'};
		int []b={1,2,3,4,5};
		char[] c={'j','i','h','g','f'};
//		for(int i=0;i<a.length;i++){
//			System.out.println(a[i]+""+b[i]+""+a[i]+""+c[i]);
//		}
		mix(a, b, c, 0);
		
	}
	public static void mix(char[] a,int[] b,char[] c,int l){
		if(l==a.length-1){
			return;
		}else{
			System.out.println(a[l]+""+b[l]+""+a[l]+""+c[l]);
			mix(a, b, c, l+1);
		}
	}

}
