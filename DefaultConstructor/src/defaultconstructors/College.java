package defaultconstructors;

public class College {
	public static void main(String[] args) {
		System.out.println("Application started");
		Student s=new Student();
		System.out.println(s.rollNo+" "+s.name);
		s.rollNo=10;
		s.name="Abc";
		System.out.println("Roll no.: "+s.rollNo+" Name: "+s.name);
		s.st();
	}

}
