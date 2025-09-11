package com.tnsif.daysix.statickeyword;

public class Employee {
	private int emp_id;
	private String name;
	
	private static String company;
	
	
	static {
		
		company = "TNS";
	}


	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", name=" + name + ", company_name=" + company +"]";
	}
	
	
	
	
	public int getEmp_id() {
		return emp_id;
	}




	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	static void display() {
        System.out.println("Within static block");
        System.out.println("Company Name :" + company);
    }
	
	
}
