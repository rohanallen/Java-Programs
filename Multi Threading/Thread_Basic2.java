package multithreading;
public class Thread_Basic2 extends Thread
{
	Printer myref;
	Thread_Basic2(Printer p)// accepts printer object
	{
		myref=p;//initializes
	}
	public void run()
	{
		myref.print("Rohan");// calls print method of printer class
	}
	public static void main(String[] args) {
		// only one printer object is created
		Printer obj = new Printer();// obj is a printer class object
		Thread_Basic2 t1 = new Thread_Basic2(obj);// thread Thread_Basic2 is having a reference of obj and this obj is passed to Thread_Basic2
		t1.start();// calls run method of thread class
	}
	// we can also create another thread class and create another thread to print lets say Rohit Doc this printing would happen randomly due to context switching b/w threads 

}
