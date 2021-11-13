package collections;
import java.util.*;
// read schoology notes or watch edureka video if u dont understand
@SuppressWarnings("unused")
@FunctionalInterface
interface A{
	void print();// function is public and abstract by default
	//lambda expressions can be only used in functional interfaces(interface which only has one abstract method)
	// a functional interface can also have multiple default or static methods but only one abstract method which will be implemented by lambda expression
}
public class Lambda_Expressions_Bsic {
// normally to implement interface we will create another class to override the abstract method and then another class with psvm() to create an object of that class and call the method.this can be avoided with lambda expressions
	public static void main(String[] args) {
		// obj is object of interface A, () represents the function being invoked(no arguments in this case) and the content inside the curly braces is the implementation of the function
	A obj = ()->{
		System.out.println("Demo of Lambda Expression");
	};
	obj.print();
	}

}
