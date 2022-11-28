package Assignment0207;

import java.util.TreeSet;

public class aabddc_a2b1d2c1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaacbbcdddeea";
		char[] ch = s.toCharArray();
		int count=0;
		char c=ch[0];
		TreeSet<Character> set=new TreeSet<>();
		for(int i=0;i<ch.length;i++){
			set.add(ch[i]);
			if(c==ch[i]){
				count++;
			}else {
				System.out.print(ch[i-1]+""+count);
				count=1;
				c=ch[i];
			}
			
		}
		System.out.print(c+""+count);
		System.out.println();
		for(Character ele:set){
			count=0;
			for(int i=0;i<ch.length;i++){
				if(ele==ch[i])
					count++;
			}					System.out.print(ele+""+count);
		}
	}

}
