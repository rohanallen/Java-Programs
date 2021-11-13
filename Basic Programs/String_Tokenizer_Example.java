package basicStuff;
import java.util.*;
/* String tokenizer used to split strings on basis of space
 * comma semi colon etc.*/
public class String_Tokenizer_Example {
public static void main(String[] args) {
		String s = "Hello World I Love U";
		/* Here we create an object st of class stringtokenizer which is
		 * already present in java package. We then pass the string to it.
		 * By default it splits by blank space. if we want to split by any other
		 * delimiter we have to specify explicitly and that time we also have to
		 * specify blank space as well.*/
		
		
		StringTokenizer st = new StringTokenizer(s);
		System.out.println(st.countTokens());// no of tokens split by space
		// st.nextToken() alone gives the first token
		while(st.hasMoreTokens())// while there are more tokens of string s
		{
			System.out.println(st.nextToken());// prints the token(string separated by blank space)
		}
		
		
		
		String s1 = "Hello, World; I Love. U";
		StringTokenizer str = new StringTokenizer(s1,",;. ");//specify delimiters including space
		while(str.hasMoreTokens())// while there are more tokens of string s
		{
			System.out.println(str.nextToken());// prints the token(string seperated by blank space)
		}
		
		
		StringTokenizer str1 = new StringTokenizer(s1,",;.");// Now we dont seperate by space
		while(str1.hasMoreTokens())
		{
			System.out.println(str1.nextToken()); // therefore tokens will have space now
		}
	}

}
