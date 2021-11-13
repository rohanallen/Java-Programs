package multithreading;
/*Thread_Basic is a thread which extends thread class and overrides 
 * its run() method. in the main(which is the main thread) we create another thread t
 * t which is the object of Thread_Basic.*/
public class Thread_Basic extends Thread {
	@Override
	public void run()
{
	for(int i=1;i<=10;i++)
		System.out.println("Document "+i+" from Printer 1");
}
	// main method represents main thread
	public static void main(String[] args) {
		
		// By the introduction of a thread t we can perform the t threads task(job1) and the main threads task(job2) concurrently or parralely so that job2 will not have to wait for long		
		// job 1		
		Thread_Basic t = new Thread_Basic();
		t.start();// to start executing new thread
		
		//job2(Normally first the t method will perform job 1 one completely and then perform job2 but this will lead to delay for job 2)
		for(int i=1;i<=10;i++)
			System.out.println("Document "+i+" from Printer 2");
		
		
		// if we look at output it is random 1st some printer 1 doc is there then doc2 and it keeps on switching between them
		
		/*We can also create a thread by implementing Runnable interface
		 * this is used when a class is already extending another class
		 * and cant extend Thread class as multiple inheritance is not allowed
		 * class Multi3 implements Runnable{
 			public void run(){
 			System.out.println("thread is running...");
 				}

		public static void main(String args[]){
 		Multi3 m1=new Multi3();
 		Thread t1 =new Thread(m1);
		t1.start();
 }
} If you are not extending the Thread class,your class object would not be treated as a thread object.So you need to
explicitely create Thread class object.We are passing the object of your class that implements Runnable so that your
class run() method may execute.	*/

	}

}
