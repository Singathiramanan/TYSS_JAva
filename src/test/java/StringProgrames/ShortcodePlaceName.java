package StringProgrames;

import java.util.LinkedList;

public class ShortcodePlaceName {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String[] place={"ALABAMA","ALASKA","BOMBAY","CHENNAI","DELHI"};
		LinkedList<String> llist=new LinkedList<String>();
		String scode="";
		for(int i=0;i<place.length;i++){
			String name = place[i];
			if(!llist.contains(scode)){
			scode = String.valueOf(name.charAt(0))+String.valueOf(name.charAt(1));
			llist.add(scode);
			}else{
				for(int j=2;j<name.length();j++){
				scode=String.valueOf(name.charAt(0))+String.valueOf(name.charAt(j));
				if(!llist.contains(scode));
					llist.add(scode);
					break;
				}
			}
					
			
		}
		for(String str:llist){
			System.out.print(str+",");
		}
	}

}
