package com.emp;

public class Department {
	Company c=new Company();
	
	public void addEmployeedetails() {
		Employee e=new Employee();
		e.eid=1001;
		e.name="Abc";
		e.salary=65000;
		
		
		c.displayEmployee(e);
		
	}
	
	public void addAllEmployeeDetails() {
		AllEmployee all=new AllEmployee();
		all.e1.eid=1002;
		all.e1.name="Xyz";
		all.e1.salary=40000;
		
		all.e2.eid=1003;
		all.e2.name="Pqr";
		all.e2.salary=60000;
		
		all.e3.eid=1004;
		all.e3.name="Abc";
		all.e3.salary=80000;
		
		
		c.displayAllEmployee(all);
		
	}
	
	

}
