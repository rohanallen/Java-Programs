// Add two matrices(same logic for sub of matrices)
package matrices;
import java.util.*;
public class Add_Matrices {
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
	public int[][] add(int a[][],int b[][])
	{
		int y[][] = new int[a.length][a[0].length];// as a and b have same now of rows and columns matrix c which stores the sum should have same no of rows and columns(also assuming fixed array and not jagged array) 
		for(int i=0;i<y.length;i++)
		{
			for(int j=0;j<y[i].length;j++)
			{
				y[i][j]= a[i][j ]+b[i][j];
			}
			
		}
		return y;
	}
		
	
	public static void main(String[] args) {
		Add_Matrices obj = new Add_Matrices();
		System.out.println("Enter Elements of Matrix 1");
		int a[][] = obj.input();
		System.out.println("Enter Elements of Matrix 2");
		int b[][] = obj.input();
		System.out.println("Matrix 1");
		obj.print(a);
		System.out.println("Matrix 2");
		obj.print(b);
		if(a.length!=b.length||a[0].length!=b[0].length)
		{
			System.out.println("Matrix Addition Condition not Satisfied");
			System.exit(0);
		}
		else
		{
		System.out.println("Matrix 3");
		int c[][] = obj.add(a,b);
		obj.print(c);
		}
	}

}
