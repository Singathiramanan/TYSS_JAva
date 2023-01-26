package StringProgrames;

public class StringBufferCheck {

	public static void main(String[] args) {
		StringBuffer a=new StringBuffer("A");
		StringBuffer b=new StringBuffer("B");
		operate(a,b);
		System.out.println("a="+a+" "+"b="+b);
	}

	private static void operate(StringBuffer x, StringBuffer y) {
		y=y.append("D");
		x=x.append(y);
		x=x.append("E");
		x=y.append("F");
		y=x.append("C");
		
		
	}

}
