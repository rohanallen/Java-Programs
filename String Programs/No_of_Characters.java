package stringShit;
//Java Program to count the total number of characters(letters) in a string
import java.util.*;
public class No_of_Characters {
public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String");
		String s=in.nextLine();
		s=s.toLowerCase();// convert to lower case
		int l=s.length();
		int count=0;
		for(int i=0;i<l;i++)
		{
			if(s.charAt(i)>='a'&&s.charAt(i)<='z')//if u write this then if(s.charAt(i)!=' ') then count++ // checks for blank space only  and omits no punctuation mark and other non letter character
			{                                 
				count++;
			}
			else
				continue;
		}
		System.out.println("Total Number of Characters in the Above String is: "+count);
	}

}
