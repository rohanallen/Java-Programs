package numberPrograms;
// program to print prime factors of a number
import java.util.*;
public class Prime_Factors {
public void prime(int n)
{
	System.out.println("Prime Factors of "+(n)+" are: ");
	for(int i=2;i<=n;i++)
	{
		while(n%i==0)// while it is divisible by i
		{
			System.out.print(i+" ");
			n=n/i;
			if(n==1)// if n becomes 1 that means your job is done(//understand prime factorization)
				break;
		}
	}
}
public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in =new Scanner(System.in);
		System.out.println("Enter Number");
		int n= in.nextInt();
		Prime_Factors obj = new Prime_Factors();
		obj.prime(n);

	}

}
