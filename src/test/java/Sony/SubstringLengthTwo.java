package Sony;

public class SubstringLengthTwo {

	public static void main(String[] args) {
		String str="aababbaa";
		for(int i=0;i<str.length();i++){
			for(int j=i+2;j<=str.length();j++){
//				System.out.println(str.substring(i, j));
//				break;
				String two = str.substring(i, j);
				if(two.length()==2){
					System.out.println(two);
				}
			}
		}

	}

}
