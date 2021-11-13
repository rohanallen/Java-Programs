// To check if String is Pallindrome
package stringShit;
import java.util.*;
public class String_Pallindome {
	String b ="";// no space
	public void isPallindrome(String s, int l)
	{
		for(int i=l-1;i>=0;i--)
		{
			b=b+s.charAt(i);
		}
		if(s.equals(b))
		{
			System.out.println(s+" is a Pallindrome");
		}
		else
		{
			System.out.println(s+" is not a Pallindrome");
		}
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String");
		String s=in.nextLine();
		s=s.toLowerCase();
		int l = s.length();
		String_Pallindome obj = new String_Pallindome();
		obj.isPallindrome(s,l);
}
}
