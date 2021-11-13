/*Circular Prime : A circular prime is a prime number with the 
 * property that the number generated at each intermediate step when 
 * cyclically permuting its (base 10) digits will be prime.
For example, 1193 is a circular prime, since 1931, 9311 and 3119 all 
are also prime. A circular prime with at least two digits can only consist of combinations of the digits 1, 3, 7 or 9, because having 0, 2, 4, 6 or 8 as the last digit makes the number divisible by 2, and having 0 or 5 as the last digit makes it divisible by 5.*/
package numberPrograms;
import java.util.*;
public class Circular_Prime {
	boolean isPrime;
	String s;
	int l,num;
	boolean isCircularPrime;
	public boolean isCircularPrime(int n)
	{
		isCircularPrime=true;
		if(!isPrime(n)||n<10)// if isPrime returns false is false
		{
			isCircularPrime=false;
			return(isCircularPrime);
		}
		else
		{
			s=Integer.toString(n);
			l=s.length();
			for(int i=0;i<l;i++)
			{
				if(s.charAt(i)=='0'||s.charAt(i)=='2'||s.charAt(i)=='4'||s.charAt(i)=='6'||s.charAt(i)=='8'||s.charAt(i)=='5')// as if no has any of these digits it will be non prime
				{
					isCircularPrime=false;
					return isCircularPrime;
				}
			}
			for(int i=1;i<l;i++)
			{
				s=s.charAt(l-1)+s.substring(0,l-1);
				num=Integer.parseInt(s);
				if(!isPrime(num))
				{
					isCircularPrime=false;
					return(isCircularPrime);
				}
					
			}
			return isCircularPrime;
		}
	}
	public boolean isPrime(int n)
	{
		isPrime=true;
		if(n==0||n==1)
			isPrime=false;
		for(int i=2;i<=(n/2);i++)
		{
			if(n%i==0)
			{
				isPrime=false;
				break;
		}
	}
		return(isPrime);
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number");
		int a = in.nextInt();
		Circular_Prime obj = new Circular_Prime();
		boolean check = obj.isCircularPrime(a);
		if(check)
			System.out.println(a+" is a Circular Prime.");
		else
			System.out.println(a+" is not a Circular Prime.");
			

	}
}
