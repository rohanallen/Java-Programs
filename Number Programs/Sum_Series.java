//Write a Java Program to print the sum of first n numbers.
//If n is 3 then print the sum of 1+2+3 to the user. Get n from the user 
package numberPrograms;
import java.util.*;
public class Sum_Series {
int sum;
public void sumSeries(int n)
{
	sum=0;
	for(int i=0;i<=n;i++)
	{
		sum=sum+(i);
		if(i==n)// how to get format of 1+2+3 in output screen
		{
			System.out.print(i);
		}
		else
		{
			System.out.print(i+"+");
		}
	}
	System.out.println();
	System.out.println("Sum is : "+sum);
}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = in.nextInt();
		Sum_Series obj = new Sum_Series();
		obj.sumSeries(n);

	}
}
