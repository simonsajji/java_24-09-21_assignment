package constructor_overloading;

public class ApplicationStudent {
	
	public static void main(String args[]) {
		
		Student obj=new Student();                                   // default constructor  with default values
		obj.print();
		System.out.println("\nParametrized constructors\n");
		Student simon=new Student(1,7908930121L,"simon");         // parametrized constructors with assigned valus for each object 
		Student jack=new Student(11,8905680121L,"jack");
		Student arthur=new Student(20,8508937121L,"arthur");
		Student mary=new Student(14,7892239230L,"Mary");
		
		simon.print();
		jack.print();
		arthur.print();
		mary.print();
		
		
	}

}
