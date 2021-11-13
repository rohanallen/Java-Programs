/*Write a Java program to generate and show all Kaprekar numbers less than 1000. Go to the editor
Expected Output :

1       1         0 + 1                                  
9       81        8 + 1                                  
45      2025      20 + 25                                
55      3025      30 + 25                                
99      9801      98 + 01                                
297     88209     88 + 209                               
703     494209    494 + 209                              
999     998001    998 + 001 */
package numberPrograms;
import java.util.*;
public class Kaprekar_Number {
	int sq,l,x,y;
	String s,left,right;
	public void printKaprekar(int a,int b)
	{
		for(int i=a;i<=b;i++)
		{
			isKaprekar(i);
		}
	}
	public void isKaprekar(int n)
	{
		sq=n*n;
		s=Integer.toString(sq);
		if(sq<10)
			s='0'+s;
		l=s.length();
		left=s.substring(0,l/2);
		right=s.substring(l/2);
		x=Integer.parseInt(left);
		y=Integer.parseInt(right);
		if(x+y==n)
			System.out.println(n+" is a Kaprekar Number.");
	}
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner in = new Scanner(System.in);
	System.out.println("Enter Range");
	int a=in.nextInt();
	int b= in.nextInt();
	Kaprekar_Number obj = new Kaprekar_Number();
	obj.printKaprekar(a,b);
			
}
}
