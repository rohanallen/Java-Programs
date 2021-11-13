package multithreading;

public class Thread_Name extends Thread {
	public void run()
	{
		for(int i=1;i<=10;i++)
			System.out.println(i);
	}
	public static void main(String[] args)
	{
		Thread_Name t1 = new Thread_Name();
		Thread_Name t2 = new Thread_Name();
		System.out.println("Name of Thread 1 is "+t1.getName());// Name of thread
		System.out.println("Name of Thread 2 is "+t2.getName());
		System.out.println("Id of Thread 1 is "+t1.getId());// get Id
		t1.start();
		t2.start();
		t1.setName("Rohan");// to change name
		System.out.println("Name of Thread 1 is "+t1.getName());
	}
}