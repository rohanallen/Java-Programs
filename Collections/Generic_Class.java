package collections;
//A class that can refer to any type is known as generic class. Here, we are using T type parameter to create the generic class of specific type.

// read priya g notes imp generic methods,wildcard etc
public class Generic_Class<T> {
	T t;// creating an object t of type T(T can be integer string whatever u instantiate it as)
public  void input(T t)// parameterized method  which accepts object t of type T from user(in first case it is Integer 10)
{
	this.t=t; //assigns it to instance variable t
}
public T get()// returns object t
{
	return t;
}
	public static void main(String[] args) {
		Generic_Class<Integer> obj = new Generic_Class<Integer>();// creating object obj of class with parameter of <Integer> so that this object obj can only pass integer value and if it passes any other value by mistake it will show error
		obj.input(10);
		//obj.input("Rohan");// error
		System.out.println("Integer Value is : "+obj.get());
		Generic_Class<String> obj1 = new Generic_Class<String>();
		obj1.input("Rohan");
		System.out.println("String Value is : "+obj1.get());
	}

}
