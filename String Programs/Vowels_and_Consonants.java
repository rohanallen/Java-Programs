//Java Program to count the total number of vowels and consonants in a string
package stringShit;
import java.util.*;
public class Vowels_and_Consonants {
	int vcount;
	int ccount;
	public void vowel(String s, int l)
	{
		vcount=0;
		ccount=0;
		for(int i=0;i<l;i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				vcount++;
			}
			else if(s.charAt(i)>='a'&&s.charAt(i)<='z')// ensures no space or any other punctuation mark is counted as a consonant
			{
				ccount++;
			}
				
		}
		System.out.println("Number of Vowels are: "+vcount);
		System.out.println("Number of Consonants are: "+ccount);
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String");
		String s=in.nextLine();
		s=s.toLowerCase();
		int l = s.length();
		Vowels_and_Consonants obj = new Vowels_and_Consonants();
		obj.vowel(s,l);

	}

}
