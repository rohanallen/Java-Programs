package numberPrograms;
import java.util.*;
/*In number theory, an abundant number is a number for which
 *  the sum of its proper divisors is greater than the number itself.*/
public class Abundant_Number {
	public void isAbundant(int num)
	{
		int n=num;
		int sum=0;
		for(int i=1;i<=(n/2);i++)
		{
			if(n%i==0)
				sum=sum+i;
		}
		if(sum>num)//(for perfect no sum==num and for deficient no sum<num
		{
			System.out.println("Abundant");
		}
		else
		{
			System.out.println(" Not Abundant");
		}
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in =new Scanner(System.in);
		System.out.println("Enter Number");
		int n= in.nextInt();
		Abundant_Number obj = new Abundant_Number();
		obj.isAbundant(n);
}
}