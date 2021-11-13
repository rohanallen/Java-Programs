package synchronization;

public class Thread_2_Print_Table extends Thread {
	Print_Table ref;
	public 	Thread_2_Print_Table( Print_Table ref)
	{
		this.ref=ref;
	}
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		ref.printTable(100);
	}
}
