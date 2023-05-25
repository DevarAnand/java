package ExceptionHandling;


import java.util.Scanner;

public class Account {
int pin;
double balance;

public Account(int pin,double balance) 
{
	this.pin=pin;
	this.balance=balance;
}
public void withdraw()
{
	Scanner a =new Scanner(System.in);
	System.out.println("enter your pin");
	int p=a.nextInt();
	
if(p==pin)
	{
	System.out.println("Enter the amount to be withdraw");
	double amount=a.nextDouble();
	if(amount>balance)
		{
		throw new InSufficientBalanceException("Balance is less");
		}
	else 
	{
		System.out.println("Collect your cash");
		balance=balance-amount;
	}
	
	}
else
{
throw new InvalidPinException("You entered wrong pin");
}
}
public void checkBal() 
{
System.out.println("Your balance is"+balance);
}

public static void main(String[] args) 
{
	Account ob=new Account(1111,5000d);
	try
	{
ob.withdraw();
	}
	finally
	{
		System.out.println("Thank u for using our banking service");
	}
}
}



class InSufficientBalanceException extends RuntimeException
{
public InSufficientBalanceException(String s)
{
	super(s);
}
}


class InvalidPinException extends RuntimeException
{
public InvalidPinException(String s)
{
	super(s);
}
}
