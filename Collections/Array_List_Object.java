package collections;
import java.util.*;
public class Array_List_Object {
	String name;// instance variables
	int age;
	int salary;
public Array_List_Object(String name,int age,int salary)// parameterized constructors
{
	this.name=name;// this is used to refer to the parameter(name) passed by object(used to avoid confusion as the instance variable to which it is being equated to also has same name.
	this.age=age;
	this.salary=salary;
}
	public static void main(String[] args) {
		Array_List_Object obj = new Array_List_Object("Rohan",19,50000);// creating objects
		Array_List_Object obj1 = new Array_List_Object("Rohit",16,60000);
		Array_List_Object obj2 = new Array_List_Object("Rahul",20,70000);
		ArrayList<Array_List_Object> al = new ArrayList<Array_List_Object>();// array list al stores data of type Array_List_Object(meaning any object of the class)
		al.add(obj);// adding objects to al
		al.add(obj1);
		al.add(obj2);
		Iterator<Array_List_Object> itr = al.iterator();// to iterate
		while(itr.hasNext())
		{
			Array_List_Object emp = itr.next();// to store current element object
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.salary);
		}
			
		
		

	}

}
