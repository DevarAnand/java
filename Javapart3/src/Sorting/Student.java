package Sorting;

import java.util.ArrayList;
import java.util.Collections;


public class Student implements Comparable<Student>
{
	String name;
	int id;
	
	public Student(String name,int id) 
	{
		this.name=name;
		this.id=id;
		}
	
	public String toString()
	{
		return name+" "+id;
	}
	
	public int compareTo(Student ob)
	{
		return this.id- ob.id;
		
	}
	
public static void main(String[] args) 
{
	ArrayList <Student> a=new ArrayList<Student>();
	
	a.add(new Student("Alex",19));
	a.add(new Student("athul",18));
	a.add(new Student("Lokesh",23));
	System.out.println(a);
	
Collections.sort(a);
	System.out.println(a);
	
	
}
	

}
