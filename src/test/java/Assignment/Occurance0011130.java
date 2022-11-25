package Assignment;

public class Occurance0011130 {

	public static void main(String[] args) {
//		String no="00111300";					
//		char[] dig = no.toCharArray();
//		char ch = dig[0];					
//		int count=0;
//		for(int i=0;i<dig.length;i++){
//			if(ch==dig[i]){					
//				count++;					
//				if(i==dig.length-1)
//					System.out.println(count);
//			}else{
//				System.out.print(count);	
//				ch=dig[i];					
//				count=1;
//				if(i==dig.length-1){
//					System.out.print(count);
//				}
//			}
//		}	
		
		
		String no="00111300";
		char[] dig = no.toCharArray();
		int count = 1;
		for (int i = 0; i < dig.length-1; i++) {		//7
			if (dig[i]==dig[i+1]) {
				count=count+1;				//2
			}
			else  {
				System.out.print(count);	//231
				count=1;			
			}
		}
		System.out.print(count);			//2--->2312
	}
}
