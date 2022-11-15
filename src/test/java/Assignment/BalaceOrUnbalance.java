package Assignment;

public class BalaceOrUnbalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sp="{[]}";
		char[] ch = sp.toCharArray();
		int s1=(int)'{',s2='}',s3='[',s4=']',s5='(',s6=')';
		int count=0;
		for(int i=0;i<ch.length;i++){
			if(ch[i]==s1||ch[i]==s3||ch[i]==s5){
				count+=1;
			}else if(ch[i]==s2&&ch[i-1]==s1){
				count-=1;
			}else if(ch[i]==s4&&ch[i-1]==s3){
				count-=1;
			}else if(ch[i]==s6&&ch[i-1]==s5){
				count-=1;
			}
			System.out.println(count);
		}
		
		if(count==0){
			System.out.println("Balanced");
		}else{
			System.out.println("Not Balanced");
		}
	}

}
