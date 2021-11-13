package synchronization;

public class Thread_1_Print_Table extends Thread {
Print_Table ref;// ref is variable of type print_table class(class with function)
public 	Thread_1_Print_Table( Print_Table ref)// receives object obj of type print_table class from ref of thread 1 in main
{
	this.ref=ref;// assigns this object
}
public void run()
{
	System.out.println(Thread.currentThread().getName());// to get thread default name
	ref.printTable(7);// to call function in print_Table class
}
}
