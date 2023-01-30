package Assignment;

public class BalacedArray {

	
	public static void main(String[] args) {
		int[] arr={5,6,8,11};
		int lcount=0,rcount=0;
	    if(arr.length>2){
	        for(int i=0;i<arr.length-1;i++){
	  
	            lcount=lcount+arr[i];
	            System.out.println(lcount);
	            if(lcount==arr[i+2]){
	                for(int j=i+2;j<arr.length;j++){
	         
	                    rcount=rcount+arr[j];
	                    
	                }
	                break;
	            }
	        }
	        if(lcount==rcount){
	            System.out.println("yes");
	        }else{
	            System.out.println("no");
	        }
	    }else{
	        System.out.println("no");
	    }
	}

}
