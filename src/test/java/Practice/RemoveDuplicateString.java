package Practice;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		String str="i am ramanan i am from tamilnadu";
		String[] s = str.split(" ");
		String str1 = "";
		for(int i=0;i<s.length;i++){
			if(!str1.contains(s[i]))
				str1+=s[i]+" ";			
		}
		System.out.println(str1);
		String[] s1 = str1.split(" ");
		for(int i=0;i<s1.length;i++){
			int count=0;
			for(int j=0;j<s.length;j++){
				if(s1[i].equals(s[j])){
					count++;
				}
			}
			if(count==1){
				System.out.print(s1[i]+" ");
			}
		}

	}

}
