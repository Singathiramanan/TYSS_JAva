package Assignment0207;

public class SwitchTheWordsInString {

	public static void main(String[] args) {
		String s="welcome to bangalore";
		String[] str = s.split(" ");
		String temp="";
		int key=2;
		for(int i=0;i<key;i++){
			temp=str[0];
			for(int j=0;j<str.length-1;j++){
				str[j]=str[j+1];				
			}
			str[str.length-1]=temp;	
		}
		for(int i=0;i<str.length;i++){
			System.out.print(str[i]+" ");
		}

	}

}
