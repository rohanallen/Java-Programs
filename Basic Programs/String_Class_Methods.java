package basicStuff;
import java.util.*;
@SuppressWarnings("unused")
public class String_Class_Methods {
public static void main(String[] args) {
		String s2 = String.join("-","Welcome","to","java");// joins with delimiter -
		System.out.println(s2);
		
		
		String s="Welcome to Java Programming";
		System.out.println(s.toUpperCase());// upper case
		System.out.println(s.toLowerCase());// lowercase
		
		
		System.out.println(s.trim());// (not shown here)eliminates whitespace before and after string.
		
		
		System.out.println(s.startsWith("We"));
		System.out.println(s.endsWith("ng"));
		
		System.out.println(s.charAt(0));
		
		
		int a=10;  
		String s1=String.valueOf(a);  // covert 10 to string
		System.out.println(s1+10);  
		
		
		System.out.println(s.replace("Java","Kaya"));

	}

}
