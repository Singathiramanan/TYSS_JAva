package Iterview_pgm;

public class FindOutput {

	public static void main(String[] args) {
		Parent obj=new Child();
		obj.display();
	}
	
}

class Parent{
	int a=100;
	public void display(){
		System.out.println(a);
	}
}

class Child extends Parent{
	int b=200;
	public void display(){
		System.out.println(b);
	}
}