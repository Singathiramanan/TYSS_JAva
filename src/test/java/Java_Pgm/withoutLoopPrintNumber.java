package Java_Pgm;

public class withoutLoopPrintNumber {
	public static void main(String[] args){
		int i=1;
		countinous(i);						//1
	}
	public static void countinous(int a){	//1,2,3,4,5,6,7,8,9,10,11
		if(a<=10){							//t,t,t,t,t,t,t,t,t,t,f
		System.out.println(a);				//{1,{2,{3,{4,{5,{6,{7,{8,{9,{10}}}}}}}}}}
		countinous(a=a+1);}
		else{	
		return;}
	}
}
