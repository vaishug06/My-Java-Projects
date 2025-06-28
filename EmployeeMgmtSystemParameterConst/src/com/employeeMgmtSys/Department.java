package com.employeeMgmtSys;

public class Department {
	public Employee addEmpDetails() {
		Employee e=new Employee(101, "Abc", 600000);
		return e;
	}
	
	public AllEmployee addAllEmpDetails() {
		Employee e1= new Employee(102, "PQR", 50000);
		Employee e2=new Employee(103, "Xyz", 700000);
		Employee e3=new Employee(104, "ABC", 600000);
		AllEmployee ae= new AllEmployee(e1, e2, e3);
		return ae;
				
	}

}
