package com.employeemgmtsys;

public class Employee {
	private int empId;
	private String empName;
	private float empSalary;
	
	public void setEmpId(int id) {
		empId=id;
	}
	public int getEmpId() {
		return empId;
	}

	public void setEmpName(String name) {
		empName=name;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpSalary(float salary) {
		empSalary=salary;
	}
	
	public float getEmpSalary()
	{
		return empSalary;
	}
	
	public void displayEmployeeDetails() {
		System.out.println("Employee Id:"+empId);
		System.out.println("Employee Name:"+empName);
		System.out.println("Employee Salary:"+empSalary);
	}
}
