/*Write a Java Program to Invert half pyramid using *
* * * * *
* * * *
* * * 
* *
*
  */
package patterns;

import java.util.*;

public class Inverted_Half_Pyramid {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Row Number");
		int n= in.nextInt();
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}

}
