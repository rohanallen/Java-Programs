/* multiply matrices 
 * The number of columns of the 1st matrix must equal the number 
 * of rows of the 2nd matrix.
And the result will have the same number of rows as the 1st matrix,
 and the same number of columns as the 2nd matrix.*/

package matrices;
import java.util.*;
public class Multiply_Matrices {
	public int[][] input()
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number of Rows of Matrix");
		int m=in.nextInt();
		System.out.println("Enter Number of Columns of Matrix");
		int n=in.nextInt();
		int x[][] = new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.println("Enter Element");
				x[i][j]=in.nextInt();
			}
		}
		return x;
	}
	public void print(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	public int[][] mul(int a[][], int b[][])
	{
		int y[][] = new int[a.length][b[0].length];
		int sum=0;
		for(int i=0;i<a.length;i++)// row length in matrix 1
		{
			for(int j=0;j<b[i].length;j++)//column length in matrix 2
			{
				for(int k=0;k<b.length;k++)// watch telusko video
				{
					sum = sum + (a[i][k]*b[k][j]);
				}
				y[i][j] = sum;
				sum=0;
			}
		}
		return y;
	}
	public static void main(String[] args) {
		Multiply_Matrices obj = new Multiply_Matrices();
		System.out.println("Enter Elements of Matrix 1");
		int a[][] = obj.input();
		System.out.println("Enter Elements of Matrix 2");
		int b[][] = obj.input();
		System.out.println("Matrix 1");
		obj.print(a);
		System.out.println("Matrix 2");
		obj.print(b);
		if(a[0].length!=b.length)
		{
			System.out.println("Matrix Multiplication Condition not Satisfied");
			System.exit(0);
		}
		else {
		System.out.println("Matrix 3");
		int c[][] = obj.mul(a,b);
		obj.print(c);
		}
		
	}
}
