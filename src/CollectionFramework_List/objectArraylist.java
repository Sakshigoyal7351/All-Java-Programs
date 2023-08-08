package CollectionFramework_List;

import java.util.ArrayList;

class Employee
{
	int eid;
	String ename;
	int esalary;
	public Employee(int eid, String ename, int esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}

}

public class objectArraylist {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1,"Aryan",10000);
		
		Employee e2 = new Employee(2,"swati", 20000);
		
		Employee e3 = new Employee(3,"ram", 30000);
		
		
		ArrayList<Employee> l1 = new ArrayList<Employee>();
		
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		
		for(Employee i:l1)
		{
			System.out.print(i.eid+"  ");
			System.out.print(i.ename+"  ");
			System.out.print(i.esalary+" ");
			System.out.println();
		}

	}

}
