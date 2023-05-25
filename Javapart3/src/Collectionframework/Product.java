package Collectionframework;

import java.util.ArrayList;
	
public class Product 
{
	int id;
	String brand;
	double price;
	
	public Product(int id,String brand,double price)
	{
		this.id=id;
		this.brand=brand;
		this.price=price;
	}
	public String toString()
	{
		return id+" "+brand+" "+price;
	}
public static void main(String[] args)
{
	
	ArrayList <Product> b= new ArrayList <Product>();
	b.add(new Product(222,"kia",800000d));
	System.out.println(b);
	}
}
