package JavaRevision1;

public class Employee_Using_Object {

	public static void main(String[] args) {
		//class/object/method
		
		// class is the collection of variables and methods
		//step 3: create object and call methods in main method now to execute
		
		Employee_Using_Object emp1=new Employee_Using_Object();//creating object
		emp1.empid=505;
		emp1.empname="Anjana";
		emp1.empsalary=500;
		emp1.empdeptno=15;
		
		emp1.display();//called method

	}
	
	//step 1: asign the variables 
	int empid;
	String empname;
	int empsalary;
	int empdeptno;
	
	//step 2 create methods
	void display() {
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(empsalary);
		System.out.println(empdeptno);
	}

}
