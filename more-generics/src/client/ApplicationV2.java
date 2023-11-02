package client;

import java.util.ArrayList;
import java.util.List;

public class ApplicationV2 {

	public static void main(String[] args) {

		Object myObject = new Object();
		String myVar = "hello";
		myObject = myVar;
		
		Employee emp = new Employee();
		Accountant acc = new Accountant();
		emp = acc;
		
		
		//ArrayList accountants can't be assigned to another Array list(employees) because it is a generic class
		//Even we changed the <Employee> to <Object> as parent class of all objects if will not allow to assign

		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee());
//		ArrayList<Object> employees = new ArrayList<Object>();
		ArrayList<Accountant> accountants = new ArrayList<Accountant>();
		accountants.add(new Accountant());
//		employees = accountants;
		
		//<?> - Wildcard - This can be any data Type
		// Wildcard will allow to assign any data types
		ArrayList<?> employees2 = new ArrayList<>();
//		ArrayList<Accountant> accountants2 = new ArrayList<Accountant>();
		ArrayList<String> accountants2 = new ArrayList<String>();
		employees2 = accountants2;
		
		//UPPER BOUND - the highest class can go is Employee and all children of Employee
			//Wild Card extends Employee the list employees2 accept data of type <Employee> as well as children of Employee
			//? takes as child class
			
			//All derivatives or child of employee class are allowed 
		ArrayList<? extends Employee> employees3 = new ArrayList<>();
		ArrayList<Accountant> accountants3 = new ArrayList<Accountant>();
			//<Object> is not allowed because it is not subclass of employee.
			//<Object> is parent of Employee
		//ArrayList<Object> accountants3 = new ArrayList<Object>();

			//<Employee> is allowed
		//ArrayList<Employee> accountants3 = new ArrayList<Employee>();
		employees3 = accountants3;
		
		//Interface EmployeeI
		//Even implementing to interface this works same as above
		ArrayList<? extends EmployeeI> employees31 = new ArrayList<>();
		ArrayList<AccountantI> accountants31 = new ArrayList<AccountantI>();
		employees31 = accountants31;	
		
		//LOWER BOUND - The Lowest type it can go here is employee
		//It accept all highest type from employee this includes <Object>
		
		ArrayList<? super Employee> employees4 = new ArrayList<>();
//		ArrayList<Accountant> accountants4 = new ArrayList<Accountant>();
		ArrayList<Object> accountants4 = new ArrayList<Object>();
		employees4 = accountants4;
				
//		makeEmployeeWork(employees);
		makeEmployeeWork(accountants);
	}
	
	public static void makeEmployeeWork(List<? extends Employee> employees) {
		for(Employee employee : employees) {
			employee.work();
		}
	}

}
