package numberPrograms;
import java.util.*;
public class Disarium_Number {
	int r,n;
	double sum;// pow function returns double
	public void isDisarium(int num,int l)
	{
		n=num;
		sum=0;
		while(n!=0)
		{
			r=n%10;
			sum=sum+(Math.pow(r,l));
			n=n/10;
			l=l-1;
		}
		if(num==sum)
		{
			System.out.println(num+" is a Disarium Number ");
		}
		else
		{
			System.out.println(num+" is not a Disarium Number ");
		}
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in =new Scanner(System.in);
		System.out.println("Enter Number");
		int n= in.nextInt();
		String s =Integer.toString(n);//or String.valueOf(n);
		int l=s.length();
		Disarium_Number obj = new Disarium_Number();
		obj.isDisarium(n,l);
		
}
}
