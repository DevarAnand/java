package Objectclass;

public class Employee
{
	String eid;
	double salary;
	String name;
	String designation;
	public Employee(String eid, double salary, String name, String designation)
	{
		
		this.eid = eid;
		this.salary = salary;
		this.name = name;
		this.designation = designation;
	}
	public boolean equals (Employee ob)
	{
		return this.name==ob.name && this.eid==ob.eid;
	}

	public static void main(String[] args) 
	
	{
		Employee x1 = new Employee("Abc123",15000d,"Bala","Testing");
		Employee x2 = new Employee("xyz345",20000d,"Srini","Developer");
		Employee x3 = new Employee("Def789",30000d,"venkat","HR");
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x1.equals(x2));
	}
	public String toString()
	{
		return eid +" "+name+" "+designation+" "+salary;
	}
		
	

}
