/*Write a Java Program to Invert full pyramid using *

* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
*/
package patterns;
import java.util.*;
public class Inverted_Full_Pyramid {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner in = new Scanner(System.in);
	System.out.println("Enter Row Number");
	int n= in.nextInt();
	int k=0;
	int count=n+(n-1);// think to get function u understood
	for(int i=1;i<=n;i++)
	{
		for(int a=1;a<=k;a++)
		{
			System.out.print(" ");
		}
		k=k+2;
		for(int j=1;j<=count;j++)
		{
			System.out.print("*"+" ");
		}
		count=count-2;
		System.out.println();
	}
		

	}

}
