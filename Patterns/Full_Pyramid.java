/*Write a Java Program to print full pyramid using *
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
*/
package patterns;
import java.util.*;
public class Full_Pyramid {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner in = new Scanner(System.in);
	System.out.println("Enter Row Number");
	int n= in.nextInt();
	int k=(n-1)*2;//(when n=2,k=2andn=5,k=8thus we get function)
    int count=1;
    for(int i=1;i<=n;i++)// to iterate n times
    {
    	for(int a=1;a<=k;a++)// to print spaces according to row
    	{
    		System.out.print(" ");
    	}
    	k=k-2;// no of spaces decrease by 2 each corresponding row
    	for(int j=1;j<=count;j++)// to print row elements
    	{
    		System.out.print("*"+" ");
    	}
    	count =count+2;
    	System.out.println();// to go to next line
    }
	}

}
