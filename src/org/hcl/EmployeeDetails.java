//create the Package Name using only small letter and seprated by the dot
package org.hcl;

//create a class name
public class EmployeeDetails {
	
//create a methods inside the class
	
	
	//method1
	
	private void employeeName() {
		
		System.out.println("Employee Name : Ram");
		
	}
	//method2
		
	private void employeeId() {
		
		System.out.println("Employee Id : 2888");
		System.out.println("Empolyee Id : 1234");
	
		
	}
	
	//Main method creation
	//main ctrl+space, enter
	
	public static void main(String[] args) {
		
		
		//object creation
		//Formula : ClassName objectName=new ClassName();
		
		EmployeeDetails e=new EmployeeDetails();
		
		//Method Calling
		//Formula : objectName.methodName();
		
		e.employeeId();
		e.employeeName();
	}
		
	
}
	
	




