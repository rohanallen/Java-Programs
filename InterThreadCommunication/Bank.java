package interThreadCommunication;

public class Bank {
int balance =10000;
synchronized void withdraw(int n)
{
	System.out.println("Program is running");
	System.out.println("Current Balance is "+balance);
	if(n>balance)// if withdraw amount is greater than balance
	{
		System.out.println("Not enough balance");
		try// below code can raise exception
		{
			wait();// t1 waits and releases its lock so that t2 gets executed and waits till t2 notifies t1 then it resumes from the current line of code
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	balance=balance-n;
	System.out.println("New Balance after withdrawing is "+balance);
	notify();// to notify other waiting threads(in this case no one) that t1 is done 
}
synchronized void deposit(int n)
{
	System.out.println("going to deposit..."); 
	balance=balance+n;
	System.out.println("New Balance after depositing "+balance);
	notify();// to notify other waiting threads(t1) that t2 is done and t1 can resume
}
}
