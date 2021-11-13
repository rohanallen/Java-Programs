/*A Duck number is a number which has zeroes present in it,
 *  but there should be no zero present in the beginning of the number.
 *   For example 3210, 7056, 8430709 are all duck numbers whereas
 *    08237, 04309 are not.*/
package numberPrograms;
import java.util.*;
public class Duck_Number {
	String s="";
	public int isDuck(int n)
	{
		s=Integer.toString(n);
		s=s.trim();
		if(s.charAt(0)=='0')
		{
			return 0;
		}
		else
		{
			for(int i=1;i<s.length();i++)
			{
				if(s.charAt(i)=='0')
				{
					return 1;
				}
			}
			return 0;
		}
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number");
		int n= in.nextInt();
		Duck_Number obj = new Duck_Number();
		int result =obj.isDuck(n);
		if(result==1)
			System.out.println(n+" is a Duck Number");
		else
			System.out.println(n+" is not a Duck Number");

	}
}
