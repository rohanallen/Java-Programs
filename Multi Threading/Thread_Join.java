package multithreading;

public class Thread_Join extends Thread {
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
		Thread_Join t1 = new Thread_Join();
		Thread_Join t2 = new Thread_Join();
		Thread_Join t3 = new Thread_Join();
		t1.start();
		try// put join function in try block as it could raise an exception
		{
			t1.join();// will ensure t1 finishes its task before going to t2 or t3
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		t2.start();
		t3.start();// execution b/w t2 and t3 however switch alternately becuz of sleep method as no join method is invoked
		// See Output
		// we can use t1.join(1500) also// this means t1 will execute uninterrupted for 1500ms(1500ms means 3 times) after which it may be interrupted
		// instead of using the join method everytime to stop multithreading we can just use the synchronize keyword for the function(discussed later)
	}
	
	

}
