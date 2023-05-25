package Collectionframework;

import java.util.ArrayList;

public class HeterogenousData 
{
	public static void main(String[] args) 
	{
		ArrayList<Object> b=new ArrayList <Object>();
		b.add(10);
		b.add("Java");
		b.add(1.2f);
		b.add(15000d);
		b.add('A');
		b.add(true);
		System.out.println("Size of List is : "+b.size());
		System.out.println("printing elements");
		for(Object i : b)
		{
			System.out.println(i);
		}
		
		
		
	}

}
