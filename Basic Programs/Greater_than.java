/*Write a Java program that accepts three integers from the user 
 * and return true if the second number is greater than first number 
 * and third number is greater than second number. */
package basicStuff;

import java.util.*;
public class Greater_than {
	boolean isGreater;
	public void greaterThan(int a,int b,int c)
	{
		isGreater=false;
		if((b>a)&&(c>b))
			isGreater=true;
		System.out.println(isGreater);
	}
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 3 Integers");
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		Greater_than obj = new Greater_than();
		obj.greaterThan(a,b,c);

	}
}
