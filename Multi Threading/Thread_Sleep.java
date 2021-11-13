package multithreading;

public class Thread_Sleep extends Thread {
public void run()
{
	for(int i=1;i<=5;i++)
	{
		try// put sleep function in try block as it could raise an exception
		{
			Thread.sleep(500);// thread sleeps for 500ms
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println(i);
	}
}
	public static void main(String[] args) {
		Thread_Sleep t1 = new Thread_Sleep();// create 2 threads t1 and t2
		Thread_Sleep t2 = new Thread_Sleep();
		t1.start();
		t2.start();// execute 2 threads(executes run method)

		// See output
		// first t1 sleeps and t2 executes and vice versa
		//As you know well that at a time only one thread is executed. If you sleep a thread for
		//the specified time,the thread schedular picks up another thread and so on.

	}

}
