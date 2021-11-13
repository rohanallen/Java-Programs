/* in mathematics, an automorphic number is a number whose 
 * square "ends" in the same digits as the number itself. 
 * For example, 5^2 = 25, 6^2 = 36, 76^2 = 5776, and 890625^2 = 793212890625,
 *  so 5, 6, 76 and 890625 are all automorphic numbers.*/
package numberPrograms;
import java.util.*;
public class Automorphic_Number {
	int sq;
	String a,b="";
	public void isAutomorphic(int n)
	{
		sq=n*n;
		a=Integer.toString(n);
		b=Integer.toString(sq);
		if(b.endsWith(a))
		{
			System.out.println(n+" is an Automorphic Number");
		}
		else
		{
			System.out.println(n+" is not an Automorphic Number");
		}
		
	}
public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number");
		int n= in.nextInt();
		Automorphic_Number obj = new Automorphic_Number();
		obj.isAutomorphic(n);

	}

}
