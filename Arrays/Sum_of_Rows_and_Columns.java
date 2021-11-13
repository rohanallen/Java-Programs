//In this program, we need to calculate the sum of elements in each row and each column of the given matrix.
package matrices;
import java.util.*;
public class Sum_of_Rows_and_Columns {
	int sum,sum1=0;
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
	public void sumRow(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{	sum=0;
			for(int j=0;j<a[i].length;j++)
			{
				sum=sum+a[i][j];
			}
			System.out.println("Sum of Row "+(i+1)+" is "+sum+".");
			
		}
	}
	public void sumCol(int a[][])// understand write matrix on paper write indexes see what is constant(row or matrix) and check for any pattern b/w row and col
	{
		for(int i=0;i<a[0].length;i++)
		{
			sum1=0;
			for(int j=0;j<a.length;j++)
			{
				sum1=sum1+a[j][i];
			}
			System.out.println("Sum of Column "+(i+1)+" is "+sum1+".");
			
		}
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
	public static void main(String[] args) {
		Sum_of_Rows_and_Columns obj = new Sum_of_Rows_and_Columns();
		System.out.println("Enter Elements of Matrix");
		int a[][] = obj.input();
		obj.print(a);
		obj.sumRow(a);
		obj.sumCol(a);
	}
}
