package StringProgrames;

public class CountOfStringRepeatedInAString {

	public static void main(String[] args) {
		String s1="JavaJavaJavaSeleniumJava";
		String s2="Java";
		int count=0;
		char[] a1 = s1.toCharArray();
		for(int i=0;i<a1.length;i++){
			if(s2.charAt(0)==a1[i]){
				String str = s1.substring(i, i+s2.length());
				if(str.equals(s2)){
					count++;
				}
			}
		}
		System.out.println(count);
		int[] a={12,45,22,56,78,86,54};
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]<a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}		
		}	
		System.out.println("Thired Max Element:"+a[2]);//56
		
		
	}

}
