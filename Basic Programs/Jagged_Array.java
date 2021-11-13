package basicStuff;
// demo on jagged array
import java.util.*;
public class Jagged_Array {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner in = new Scanner(System.in);
	
	int b[][] = new int [3][3];// this 2d array b has fixed no of rows(3) and each row has 3 elemets(meaning no. of columns are 3 which are fixed)
	
	
	int a[][] = new int[3][];// here i am creating a 2d array a which has fixed no of rows(=3) but column can vary(any row can have different amount of elements)
	a[0]=new int[4];// first row of 2d array a will have 4 elements
	a[1]=new int[2];// 2nd row of 2d array a will have 2 elements
	a[2]=new int[3];//3rd row of 2d array a will have 3 elements
	// this means that 2d array a will have fixed no of rows but column length varies with row this is called jagged array.
	
	for(int i=0;i<a.length;i++)//a.length symbolizes no of rows
	{
		for(int j=0;j<a[i].length;j++)//a[i].length symbolizes no of columns in each row(no of elements in each row)
		{
			System.out.println("Enter Element");
			a[i][j]=in.nextInt();
		}
	}
	
	// to print
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	// look at output
		
	
for(int i=0;i<b.length;i++)
{
	for(int j=0;j<b[i].length;j++)
	{
		System.out.print(b[i][j]+" ");
	}
	System.out.println();
}
// look at output
	
}

}
