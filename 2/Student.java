package constructor_overloading;

public class Student {
	
	private int sid;
	private long mobile;
	private String sname;
	
	public Student(int sid,long mobile,String sname) {               // setter using parameterized construtor
		this.sid=sid;
		this.mobile=mobile;
		this.sname=sname;
		
	}
	
	public Student() {
		int sid=12;
		long mobile=7384939058L;
		String name="Default";
		System.out.println(sid);
		System.out.println(mobile);
		System.out.println(name);
	}
	
	public void print() {
		System.out.println(this.sid);
		System.out.println(this.mobile);
		System.out.println(this.sname);
		System.out.println("\n");
		
	}

}
