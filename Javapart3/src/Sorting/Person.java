package Sorting;
import java.util.ArrayList;
import java.util.Collections;


public class Person implements Comparable<Person> 
{
	String name;
	int height;
public Person(String name,int height)
{
	this.name=name;
	this.height=height;
}
public String toString()
{
	return name+" "+height;
}
public int compareTo(Person ob)
{
	return this.height-ob.height;
}
public static void main(String[] args) 
{
	ArrayList <Person> a= new ArrayList<Person> ();
	a.add(new Person("Alex",180));
	a.add(new Person("bala",170));
	System.out.println(a);
	Collections.sort(a);
	System.out.println(a);
}
	
}