package Assignment;

public class dfghj {

	public static void main(String[] args) {
		
		String s="venkataramanan";
//		LinkedHashMap<Character,Integer> map=new LinkedHashMap<Character,Integer>();
//	    for(int i=0;i<s.length();i++){
//	        if(!map.containsKey(s.charAt(i))){
//	            map.put(s.charAt(i),1);
//	        }else{
//	        	Integer val = map.get(s.charAt(i));
//	        	System.out.println(val);
//	        map.put(s.charAt(i),val+=1);  
//	        }
//	    }
//	    for(Entry<Character,Integer> res:map.entrySet()){
//	        System.out.print(res.getKey()+""+res.getValue());
//	    }
		for(int i=0;i<s.length();i++){
			int count=0;
			String str="";
	        for(int j=i+1;j<s.length();j++){
	        	
	            str=s.substring(i,j);
	     
	            if(str.length()==1){
	                if(String.valueOf(s.charAt(i)).equals(str)){
	                   count++; 
	                }
	                System.out.print(s.charAt(i)+" ");
	            }
	            
	        }
	        System.out.print(count);
	        
	    }
	}

}
