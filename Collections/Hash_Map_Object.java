package collections;
import java.util.*;
public class Hash_Map_Object {
	String name;// instance variables
	int age;
	int salary;
public Hash_Map_Object(String name,int age,int salary)// parameterized constructors
{
	this.name=name;// this is used to refer to the parameter(name) passed by object(used to avoid confusion as the instance variable to which it is being equated to also has same name.
	this.age=age;
	this.salary=salary;
}
	public static void main(String[] args) {
		HashMap<Integer,Hash_Map_Object> hm = new HashMap<Integer,Hash_Map_Object>();
		Hash_Map_Object obj = new Hash_Map_Object("Rohan",19,50000);// creating objects
		Hash_Map_Object obj1 = new Hash_Map_Object("Rohit",16,60000);
		Hash_Map_Object obj2 = new Hash_Map_Object("Rahul",20,70000);
		hm.put(1,obj);
		hm.put(2,obj1);
		hm.put(3,obj2);
		for(Map.Entry<Integer,Hash_Map_Object> m:hm.entrySet())// till end of set
		{
			int key=m.getKey();	// store key of first object
			System.out.println("Values for key "+key+" are:");
			Hash_Map_Object emp = m.getValue();// store first object
			System.out.println(emp.name+"  "+emp.age+"  "+emp.salary);
		}
	}

}
