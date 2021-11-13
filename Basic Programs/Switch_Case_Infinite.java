//Write a Java Program to provide the option of adding and subtracting two numbers 
//to the user until the user wants to exit.
package basicStuff;
import java.util.*;
public class Switch_Case_Infinite {
public static int add(int a,int b)
{
	return(a+b);
}
public static int sub(int a,int b)
{
	return(a-b);
}
public static void main(String[] args)
{
	do
	{
	@SuppressWarnings("resource")
	Scanner in = new Scanner(System.in);
	System.out.println("Menu");
	System.out.println("1. Add Two Numbers");
	System.out.println("2. Subtract Two Numbers");
	System.out.println("3.Exit");
	System.out.println("Enter Your Choice");
	int choice=in.nextInt();
	switch(choice)
	{
	case 1:
		System.out.println("Enter Number 1");
		int a=in.nextInt();
		System.out.println("Enter Number 2");
		int b=in.nextInt();
		System.out.println("Sum is");
		System.out.println(add(a,b));
		break;
	case 2:
		System.out.println("Enter Number 1");
		int c=in.nextInt();
		System.out.println("Enter Number 2");
		int d=in.nextInt();
		System.out.println("Difference is");
		System.out.println(sub(c,d));
		break;
	case 3:
		System.exit(0);
		break;
	default:
		System.out.println("Wrong Choice");
	}
	}while(6!=9);
	
	
	
}
}
