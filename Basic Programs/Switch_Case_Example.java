/*Write a Java Program to display Subject Name based on 
 * room number. If the user enters 604 then display Java Programming, 
 * If the user enters 605 then display Python programming for any other 
 * input display Invalid input to the user*/
package basicStuff;
import java.util.*;
public class Switch_Case_Example {
public void input(int a)
{
	switch(a)
	{
	case 604:
		System.out.println("Java Programming");
		break;
	case 605:
		System.out.println("Python Programming");
		break;
	default:
		System.out.println("Wrong room number");
	}
}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Room Number");
		int a = in.nextInt();
		Switch_Case_Example obj = new Switch_Case_Example();
		obj.input(a);

	}
}
