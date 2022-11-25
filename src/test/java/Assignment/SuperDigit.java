package Assignment;

public class SuperDigit {

	public static void main(String[] args) {
		int result = recursiveDigitSum("9875", 4);
		System.out.println(result);
	}
	public static int recursiveDigitSum(String n,int k){
		if(n.length()==1){
	        return n.charAt(0)-48;
	    }else{
	           
	            int no=0,sum=0;
	        
	       
	        for(int i=0;i<n.length();i++){
	            no=no+((n.charAt(i)-48)*k);
	        }
	        String str=String.valueOf(no);
//	        System.out.println(str);
	            sum=sum+ recursiveDigitSum(str, 1);
	            return sum;
	        }
	    }
	}


