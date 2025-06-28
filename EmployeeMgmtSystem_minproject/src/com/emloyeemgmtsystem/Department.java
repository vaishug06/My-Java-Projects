package com.emloyeemgmtsystem;

public class Department {
	Employee addEmployeeDetails() {
		Employee employee=new Employee();
		employee.id=1001;
		employee.name="Abc ";
		employee.salary=500000;
		return employee;
		
	}
	
	AllEmployeeDetails addAllEmployeeDetails() {
		AllEmployeeDetails aed=new AllEmployeeDetails();
		aed.pqr.id=1002;
		aed.pqr.name="PQR";
		aed.pqr.salary=600000;
		
		aed.xzy.id=1003;
		aed.xzy.name="XYZ";
		aed.xzy.salary=500000;
		
		aed.efg.id=1004;
		aed.efg.name="EFG";
		aed.efg.salary=450000;
		
		return aed;
	}

}
