/*Java Program to determine whether two strings are anagrams
Two Strings are called the anagram if they contain the same characters.
 However, the order or sequence of the characters can be different.*/
package stringShit;
import java.util.*;
public class Anagram {
	char temp;
	public void isAnagram(String s, String s1)
	{
		//Converting both the arrays to character array in order to sort (we can to it manually but thats hetic)
		char[] string1 = s.toCharArray();  
		char[] string2 = s1.toCharArray();

		/*Sorting the arrays can also be done using in-built function sort ()  
        Arrays.sort(string1);  
        Arrays.sort(string2); */


		if(Arrays.equals(sort(string1), sort(string2))) {  // array method equals checks if char array string 1 and string 2 after undergoing sorting method are equal
			System.out.println("Both the strings are anagram");  
		}  
		else {  
			System.out.println("Both the strings are not anagram");  
		}  
	}
	public char[] sort(char a[])// as it takes in char array and returns a char array
	{
		temp=' ';
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;

		/*Sorting the arrays can also be done using in-built function sort ()  
        Arrays.sort(string1);  
        Arrays.sort(string2); 
         if(Arrays.equals(string1, string2)) */
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String 1");
		String s=in.nextLine();
		System.out.println("Enter String 2");
		String s1=in.nextLine();
		s=s.trim();// remove blank spaces before and after
		s1=s1.trim();
		s=s.toLowerCase();
		s1=s1.toLowerCase();
		int l = s.length();
		int l1 = s1.length();
		if(l!=l1)
		{
			System.out.println("Above given Strings are not Anagrams");
			System.exit(0);// exit program
		}
		else
		{
			Anagram obj = new Anagram();
			obj.isAnagram(s,s1);
		}

	}
}
