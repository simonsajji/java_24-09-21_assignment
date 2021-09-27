package method_overloading;

public class A {
	
	public static void main(String args[]) {
		
		B obj=new B();
		
		obj.sum(2,3);
		
		obj.sum(2.4, 4.5);
		
		obj.sum(5,6,7);
	}

}
