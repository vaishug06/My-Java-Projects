package com.datatypespractice;

public class Employee {
	
	short empId=1001;
	String empName="Abc Pqr";
	String address="Pune";
	long empMoblieNo=9623648131l;
	float salary=600000.0f;
	byte leavesAvail=10;
	//int ;
	long adhaarNo=123456789044l;
	char gender='F';
	boolean isPermanent=true;
	double annualBonus=120000.864;
	
	public static void main(String[] args) {
		Employee e=new Employee();
		System.out.println("Employee Details:");
		System.out.println("Employee ID: "+e.empId);
		System.out.println("Name: "+e.empName);
		System.out.println("Gender: "+e.gender);
		System.out.println("Address: "+e.address);
		System.out.println("Contact No.: "+e.empMoblieNo);
		System.out.println("Adhaar No.: "+e.adhaarNo);
		System.out.println("Permanent: "+e.isPermanent);
		System.out.println("Salary: "+e.salary);
		System.out.println("Bonus: "+e.annualBonus);
		System.out.println("Number of leaves available: "+e.leavesAvail);
	}

}
