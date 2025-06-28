package defaultconstructors;

public class Student {
	int rollNo;
	String name;
	
	public Student()
	{
		System.out.println("Default constructor of Student class");
	}
	
	public void st()
	{
		System.out.println("st method from Student class");
		Details d=new Details();
		d.marks=89;
		d.result="Pass";
		d.d1();
		System.out.println("Marks: "+d.marks);
		System.out.println("Result: "+d.result);
	}

}
