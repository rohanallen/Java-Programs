package basicStuff;
import java.util.*;
@SuppressWarnings("unused")
public class Split_Method_Demo
{
	public static void main(String[] args) {
	String s = " Hello World  ";
	s=s.trim();// removes space only before and after string
	String arr[] = s.split(" ");// split by blank space(returns output as array)
	for(String string:arr)
	{
		System.out.println(string);
	}
	
	
	
	String s1= "Hello!World";
	String arr1[] = s1.split("!");// split by exclamation mark
	for(String string:arr1)
	{
		System.out.println(string);
	}
	
	
	
	String s2 = "Rohan Welcome to India";
	String arr2[]= s2.split(" ",2);// split by blank and return array of length 2
	for(String string:arr2)
	{
		System.out.println(string);
	}

	
	String arr3[]= s2.split(" ",3);// split by blank and return array of length 3
	for(String string:arr3)
	{
		System.out.println(string);
	}
}
}
