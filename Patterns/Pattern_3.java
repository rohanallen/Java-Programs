/*
        * 
      * *
    * * *
  * * * *
* * * * *  
  
 */
package patterns;
import java.util.*;
public class Pattern_3 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number of Rows");
		int n= in.nextInt();
		int k=(n-1)*2;// stores no of spaces required for printing first row(x2 as space b/w is considered)
		for(int i=1;i<=n;i++)
		{
			for(int a=1;a<=k;a++)// for loop to print spaces
			{
				System.out.print(" ");
			}
			k=k-2; // space required decreases by two for subsequent rows
			for(int j=1;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}


	}

}
