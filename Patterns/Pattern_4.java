/*Print

 
                 *
             * * *
         * * * * *
     * * * * * * *
 * * * * * * * * *
  */
package patterns;
import java.util.*;
public class Pattern_4 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in =new Scanner(System.in);
		System.out.println("Enter Number of Rows");
		int n= in.nextInt();
		int k=(n-1)*4;// spaces
		int count=1;
		for(int i=1;i<=n;i++)// to iterate n times
		{
			for(int a=1;a<=k;a++)// to print spaces according to row
			{
				System.out.print(" ");
			}
			k=k-4;
			for(int j=1;j<=count;j++)// to print each row
			{
				System.out.print("*"+" ");
			}
			count = count +2;
			System.out.println();
		}
	}

}
