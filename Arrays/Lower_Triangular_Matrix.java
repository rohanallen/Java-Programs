/*Lower triangular matrix is a square matrix in which all the elements above the principle diagonal will be zero.
 * Upper triangular matrix is a square matrix in which all the elements below the principle diagonal will be zero*/
package matrices;
import java.util.*;
public class Lower_Triangular_Matrix {
	boolean flag,flag1;
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
	public boolean isLowerTriangular(int a[][])
	{
		flag=true;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a[i].length;j++)
			{
				if(a[i][j]!=0)
				{
					flag=false;
					return(flag);
				}
			}
		}
		return flag;
	}
	public boolean isUpperTriangular(int a[][])
	{
		flag1=true;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(a[i][j]!=0)
				{
					flag1=false;
					return(flag1);
				}
			}
		}
		return flag1;
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
		Lower_Triangular_Matrix obj = new Lower_Triangular_Matrix();
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
		boolean isLower=obj.isLowerTriangular(a);
		if(isLower)
			System.out.println("Is Lower Triangular");
		else
			System.out.println("Is not Lower Triangular");
		boolean isUpper=obj.isUpperTriangular(a);
		if(isUpper)
			System.out.println("Is Upper Triangular");
		else
			System.out.println("Is not Upper Triangular");
		}
	}
}
