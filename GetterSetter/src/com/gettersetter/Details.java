package com.gettersetter;

public class Details {
	public static void main(String[] args) {
		Student s=new Student();
		s.setId(1001);
		s.setName("Abc");
		s.setAddress("Pune");
		s.setContact(1234678);
		s.setGrade('A');
		
		System.out.println("ID: "+s.getId());
		System.out.println("Name: "+s.getName());
		System.out.println("Address: "+s.getAddress());
		System.out.println("Contact No.: "+s.getContact());
		System.out.println("Grade: "+s.getGrade());
		
	}

}
