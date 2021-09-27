package method_overloading;

public class B {
	
	// Create 3 funtions to print sum  and by using method overloading and call this by creating object of this class and calling it in another class "A" and using 
//	obj.show()
	
	public static void sum(int a,int b) {
		System.out.println(a+b);
	}
	
	public static void sum(int a,int b ,int c) {
		System.out.println(a+b+c);
	}
	
	public static void sum(double c,double g) {
		System.out.println(c+g);
	}
	
	

}
