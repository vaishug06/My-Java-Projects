package com.employeemgmtsys;

public class TestClass {
	public static void main(String[] args) {
		Manager m=new Manager();
		m.setEmpId(101);
		m.setEmpName("Abc");
		m.setEmpSalary(100000);
		m.setTeamSize(10);
		System.out.println("Manager Details-----");
		m.displayEmployeeDetails();
		System.out.println();
		
		Developer d=new Developer();
		d.setEmpId(102);
		d.setEmpName("Pqr");
		d.setEmpSalary(80000);		
		d.setProgmLang("Java");
		System.out.println("Developer Details------");
		d.displayEmployeeDetails();
		System.out.println();
		
		Tester t=new Tester();
		t.setEmpId(103);
		t.setEmpName("Xyz");
		t.setEmpSalary(70000);
		t.setNoOfBugs(10);
		System.out.println("Tester Details------");
		t.displayEmployeeDetails();
	}

}
