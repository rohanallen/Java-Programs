/*Write a Java program to display first 10 lucus numbers. 
 * The sequence of Lucas numbers is: 2, 1, 3, 4, 7, 11, 18, 29, ….*/
package numberPrograms;
import java.util.*;
public class Luccus_Series {
	public void lucas(int n)
	{
		int a=2;
		int b=1;
		System.out.println("The Lucas Series upto "+n+" term(s) is : ");
		
		if(n==1)
			System.out.print(a);
		else if(n==2)
		{
			System.out.print(a+" ");
			System.out.print(b);
		}
		else
		{
			System.out.print(a+" ");
			System.out.print(b+" ");
			for(int i=3;i<=n;i++)
			{
				int next =a+b;
				System.out.print(next+" ");
				a=b;
				b=next;
			}
		}
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in =new Scanner(System.in);
		System.out.println("Enter Number of Terms");
		int n= in.nextInt();
		Luccus_Series obj = new Luccus_Series();
		obj.lucas(n);
}
}
