package basicStuff;

import java.util.Scanner;

public class Operations
{
	int a,x;
	String y;
	double b;
	char c;
	Operations(int x,String y)
	{
		this.x=x;
		this.y=y;
	}
	public void decimal(double b,char c)
	{
		this.b=b;
		this.c=c;
		System.out.println(b+" "+c);
	}
	public static void main(String[] args)
	{
		Scanner in= new Scanner(System.in);
		int a;
		System.out.println("Enter Number:");
		a=in.nextInt();
		System.out.println("The input value is "+a);
		Operations obj = new Operations(30,"Rohan");// constructor
		obj.a=10;
		System.out.println(obj.a);// by reference
		System.out.println(obj.x +" "+ obj.y);// constructor values
		obj.decimal(10.91,'D');// method
	}
}