/*Happy number: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1, or it loops endlessly in a cycle which does not include 1.
Example: 19 is a happy number
1^2 + 9^2=82
8^2 + 2^2=68
6^2 + 8^2=100
1^2 + 0^2 + 0^2  =  1 */
package numberPrograms;
import java.util.*;
public class Happy_Number {
	int sum,r;
	public void isHappy(int n)
	{
		r=0;
		sum=0;
		while(n!=0)
		{
			r=n%10;
			sum=sum+(r*r);
			n=n/10;
		}
		if(sum==1)
		{
			System.out.println("It is a Happy Number");
			
		}
		else if(sum==4)// if sum becomes 4 that means sum of squares will never become 1 and will follow pattern of 4,16,37.....
		{
			System.out.println("It is not a Happy Number");
		}
		else
		{
			isHappy(sum);// recursive function call till sum becomes 1
		}
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in =new Scanner(System.in);
		System.out.println("Enter Number");
		int n= in.nextInt();
		Happy_Number obj = new Happy_Number();
		obj.isHappy(n);
		
}
}
