/*Print
 
*
* * *
* * * * *
* * * * * * *
* * * * * * * * *
  */
package patterns;
import java.util.*;
public class Pattern_2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in =new Scanner(System.in);
		System.out.println("Enter Number of Rows in Pyramid");
		int n = in.nextInt();
		int count=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=count;j++)
			{
				System.out.print("*"+" ");
			}
			count=count+2;
			System.out.println();
		}

	}

}
