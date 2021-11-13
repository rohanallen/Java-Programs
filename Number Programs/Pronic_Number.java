/*A pronic number is a number which is the product of two 
 * consecutive integers, that is, a number of the form n(n + 1).*/
package numberPrograms;
import java.util.*;
public class Pronic_Number {
boolean isPronic;
public void pronic(int n)
{	
	isPronic=false;
	for(int i=1;i<n;i++)
	{
		if(i*(i+1)==n)
		{
			isPronic=true;
			break;
		}
	}
	if(isPronic)
	{
		System.out.println(n+" is a Pronic Number.");
	}
	else
	{
		System.out.println(n+" is not a Pronic Number.");
	}
		
}
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner in =new Scanner(System.in);
	System.out.println("Enter Number");
	int n= in.nextInt();
	Pronic_Number obj = new Pronic_Number();
	obj.pronic(n);
}
}
