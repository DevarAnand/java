package Collectionframework;
import java.util.ArrayList;
import java.util.Collections;

public class SortingString 
{
	public static void main(String[] args)
	{
		ArrayList <String> a=new ArrayList <String> ();
		a.add("java");
		a.add("Sql");
		a.add("manaual");
		a.add("api");
		a.add("web");
		a.add("javascript");
		System.out.println("printing size");
		System.out.println("size of the list is "+a.size());
		System.out.println("print using for loop");
		for (int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		System.out.println("print using foreach");
		for (String i : a)
		{
			System.out.println(i);
		}
		Collections.sort(a);
		System.out.println(a);
	}

}
