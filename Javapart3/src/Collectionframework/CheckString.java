package Collectionframework;

import java.util.ArrayList;


public class CheckString
{
	public static void main(String[] args)
	{
		ArrayList<String> a=new ArrayList<String>();
		a.add("Manaual");
        a.add("Java");
        a.add("Api");
        a.add("sql");
       System.out.println(a);
       System.out.println("sql");
       if(a.contains("sql"))
       {
    	   System.out.println("hi");
    	   }
       else
       {
    	   System.out.println("Hello");
       }
	}
	

}
