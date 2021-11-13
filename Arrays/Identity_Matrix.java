/*  100
 *  010
 *  001  
 *  Check if matrix is like this*/
package matrices;
import java.util.*;
public class Identity_Matrix {
	boolean flag;
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
	public boolean isIdentity(int a[][])
	{
		flag=true;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i==j&&a[i][j]!=1)
				{
					flag=false;
					return(flag);
				}
				if(i!=j&&a[i][j]!=0)
				{
					flag=false;
					return(flag);
				}
			}
	}
		return(flag);
	}
	public static void main(String[] args) {
		Identity_Matrix obj = new Identity_Matrix();
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
		boolean isIdentity=obj.isIdentity(a);
		if(isIdentity)
			System.out.println("It is an Identity Matrix");
		else
			System.out.println("It is not an Identity Matrix");
		}
}
}
