package multithreading;
//The currentThread() method returns a reference of currently executing thread.
public class Thread_Current extends Thread {
	public void run(){
		 System.out.println(Thread.currentThread().getName());// to get name of current thread
		 System.out.println("running thread priority is: "+Thread.currentThread().getPriority());// returns priority
	}
		 public static void main(String args[]){
			 Thread_Current t1=new Thread_Current();
			 Thread_Current t2=new Thread_Current();
			 t1.setPriority(Thread.MIN_PRIORITY);//1
			 t2.setPriority(Thread.MAX_PRIORITY); //10
			 //Default priority is  NORM_PRIORITY=5
			 t1.start();
			 t2.start();
		 }
		 } 

