package numberPrograms;

import java.util.*;

/*In number system, ugly numbers are positive numbers 
 * whose only prime factors are 2, 3 or 5. First 10 ugly
 *  numbers are 1, 2, 3, 4, 5, 6, 8, 9, 10, 12. By convention, 1 is included.*/
public class Ugly_Number {
	public void ugly(int num)
	{
		int x=0;
		int n=num;
		while(n!=1)// checks if 2or3or5 is the only prime factors
		{
			if(n%2==0)
				n=n/2;
			else if(n%3==0)
				n=n/3;
			else if(n%5==0)
				n=n/5;
			else
			{
				 x=1;
				 System.out.println(num+" is not an Ugly Number");
				 break;
			}
		}
		if(x==0)
			System.out.println(num+" is an Ugly Number");
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in =new Scanner(System.in);
		System.out.println("Enter Number");
		int n= in.nextInt();
		Ugly_Number obj = new Ugly_Number();
		obj.ugly(n);

	}
}
