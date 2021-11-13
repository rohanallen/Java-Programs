package basicStuff;
//Write a Java Program to generate the random number between the ranges.
import java.util.*;
public class Random_Number {
public static void main(String[] args)
{
	@SuppressWarnings("resource")
	Scanner in =new Scanner(System.in);
	System.out.println("Enter Range");
	int max=in.nextInt();
	int min = in.nextInt();
	System.out.println("Random No is:");
	System.out.println(((int)Math.random()*((max-min)+1))+min);
}
}
