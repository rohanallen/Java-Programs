/*Write a Java Program to Print Floyd's Triangle.
1
2 3
4 5 6
7 8 9 10
 */
package patterns;
import java.util.*;
public class Floyds_Triangle {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number of Rows");
		int n= in.nextInt();
		int count=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(count+" ");
				count=count+1;
			}
			System.out.println();
		}


	}

}
