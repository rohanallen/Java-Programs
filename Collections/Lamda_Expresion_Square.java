package collections;
import java.util.*;
@FunctionalInterface
interface Square
{
	public int square(int n);//abstract method by default
	default void m()
	{
		System.out.println("Default Method");
	}
	static void l()
	{
		System.out.println("Static Method");
	}
}
public class Lamda_Expresion_Square {
// if confused just imagine how normally u would implement interface and write overidden method then u can do lambda easily 
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number");
		int a=in.nextInt();
		// n is argument passed to abstract method(multiple arguments can be passed)
		Square obj= (n)->{
			return n*n;
		};
		System.out.println("Square of "+a+" is "+obj.square(a));
		obj.m();// multiple static and default method can be implemented using lambda expresions but only one abstract method
		Square.l();// static method has to be referenced by interface only not its object

	}

}
