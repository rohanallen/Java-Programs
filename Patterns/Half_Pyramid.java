/*Write a Java Program to print half pyramid using *
*
* *
* * *
* * * *
* * * * *
*/
package patterns;

import java.util.*;

public class Half_Pyramid {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Row Number");
		int n= in.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}

}
