package JavaRevision1;

public class Employee_Using_Constructor {
	//Step 1 assign variables
	
	int empId;
	String empName;
	int empSalary;
	int empDeptNo;
	
	//Step 2 use parameter specifying data type and variable
	Employee_Using_Constructor(int id,String name,int sal,int deptno){
		empId=id;
		empName=name;
		empSalary=sal;
		empDeptNo=deptno;
	}
	
	//step 3 create method to print
	void display() {
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empSalary);
		System.out.println(empDeptNo);
	}
	
     //step 4 create main method to call and execute
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// step 5 create constructor with same class name and pass the value
		Employee_Using_Constructor emp1 = new Employee_Using_Constructor(505,"Anjana",500,15);
		
		// step 6 call method using obj.method
		emp1.display();

	}

}
