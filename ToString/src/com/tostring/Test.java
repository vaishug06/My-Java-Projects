package com.tostring;

public class Test {

	static {
		System.out.println("static block");
	}
	
	
	
	
	public static void main(String[] args) {
		Student st=new Student();
		st.rollno=56;
		st.name="Abc";
		System.out.println(st.toString());
		Student s2=new Student();
		
	}
}
