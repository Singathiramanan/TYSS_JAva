package StringProgrames;

public class Immutable {

	public static void main(String[] args) {
		StringBuffer a=new StringBuffer("A");
		StringBuffer b=new StringBuffer("B");
		operate(a,b);
		System.out.println("a="+a+" "+"b="+b);
	}
	public static void operate(StringBuffer x,StringBuffer y) {
		x=x.append(y);
		y=x.append("C");
		y=y.append("D");
	}

}
