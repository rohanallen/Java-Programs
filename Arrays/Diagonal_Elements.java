// print diagonal and non diagonal elements of matrice and their sums
package matrices;
import java.util.*;
public class Diagonal_Elements {
	int sum,sum1;
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
	public void printDiag(int a[][])
	{
		sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{ 
				if(i==j)
				{
					sum=sum+a[i][j];
					System.out.print(a[i][j]);
				}
				else
					System.out.print("*");
			}
			System.out.println();
	}
		System.out.println("Sum of Diagonal Elements are: "+ sum);
	}
	public void printNonDiag(int a[][])
	{
		sum1=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{ 
				if(i!=j)
				{
					sum1=sum1+a[i][j];
					System.out.print(a[i][j]);
				}
				else
					System.out.print("*");
			}
			System.out.println();
	}
		System.out.println("Sum of Non Diagonal Elements are: "+ sum1);
	}
	public static void main(String[] args) {
		Diagonal_Elements obj = new Diagonal_Elements();
		System.out.println("Enter Elements of Matrix");
		int a[][] = obj.input();
		obj.print(a);
		if(a.length!=a[0].length)
		{
			System.out.println("Should Be Square Matrix");
			System.exit(0);
		}
		else
		{
		obj.printDiag(a);
		obj.printNonDiag(a);
		}
}
}
